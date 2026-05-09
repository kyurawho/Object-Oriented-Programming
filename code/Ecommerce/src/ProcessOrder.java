
class ProcessOrder {
    private final Cart cart;
    private final Inventory inventory;
    private final PaymentMethod payment;
    private final Shipping shipping;
    private final Notification notification;
    private final Database database;

    public ProcessOrder(Cart cart, Inventory inventory, PaymentMethod payment, Shipping shipping, Notification notification, Database database) {
        this.cart = cart;
        this.inventory = inventory;
        this.payment = payment;
        this.shipping = shipping;
        this.notification = notification;
        this.database = database;
    }

    public void showInventory() {
        System.out.println("===== INVENTORY =====");
        for (Product p : inventory.getAll()) {
            System.out.println(p.name + " | " + p.category + " | $" + p.price + " | " + p.extraInfo);
        }
    }

    public void addToCart(String productName) {
        Product p = inventory.findByName(productName);
        if (p != null) {
            cart.add(p);
        } else {
            System.out.println("Product not found.");
        }
    }

    public void showCart() {
        System.out.println("===== CART =====");
        for (Product p : cart.getItems()) {
            System.out.println(p.name + " - $" + p.price);
        }
    }

    public void checkout(Customer customer) {
        double total = cart.calculateTotal();
        if (total == 0) {
            System.out.println("Cart is empty.");
            return;
        }

        payment.process(customer, total);
        shipping.ship(customer);
        notification.send(customer);

        System.out.println("===== INVOICE =====");
        System.out.println("Customer: " + customer.name);
        for (Product p : cart.getItems()) {
            System.out.println(p.name + " - $" + p.price);
        }
        System.out.println("TOTAL: $" + total);

        database.save(customer, cart, total);
    }

    public void printSalesReport() {
        System.out.println("===== SALES REPORT =====");
        System.out.println("Total items sold: " + cart.getItems().size());
        System.out.println("Revenue: $" + cart.calculateTotal());
    }
}