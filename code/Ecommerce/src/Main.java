public class Main {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();
        Cart cart = new Cart();
        
        inventory.add(new ElectronicProduct("Gaming Laptop", 1500, 24));
        inventory.add(new FoodProduct("Bengbeng", 5, "2027-01-01"));
        inventory.add(new FashionProduct("Jacket", 120, "L"));

        PaymentMethod payment = new CreditCardPayment();
        Shipping shipping = new JNEShipping();
        Notification notification = new EmailNotification();
        Database database = new MySQLDatabase();

        ProcessOrder orderProcessor = new ProcessOrder(cart, inventory, payment, shipping, notification, database);

        orderProcessor.showInventory();

        Customer customer = new Customer("Bibi", "bibi@email.com", "08123456789", "Jakarta, Indonesia");

        orderProcessor.addToCart("Gaming Laptop");
        orderProcessor.addToCart("Premium Jacket");
        orderProcessor.showCart();

        orderProcessor.checkout(customer);
        
        orderProcessor.printSalesReport();
    }
}