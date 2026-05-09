import java.util.*;

class EcommerceSystem {

    private List<Product> inventory = new ArrayList<>();
    private List<Product> cart = new ArrayList<>();
    
    public void addElectronicsProduct(String name, double price, int warrantyMonths) {
        Product p = new Product(name, "Electronics", price, "Warranty: " + warrantyMonths + " months");
        inventory.add(p);
        System.out.println("Electronics product added: " + name);
    }

    public void addFoodProduct(String name, double price, String expiryDate) {
        Product p = new Product(name, "Food", price, "Expiry: " + expiryDate);
        inventory.add(p);
        System.out.println("Food product added: " + name);
    }

    public void addFashionProduct(String name, double price, String size) {
        Product p = new Product(name, "Fashion", price, "Size: " + size);
        inventory.add(p);
        System.out.println("Fashion product added: " + name);
    }

    public void showInventory() {
        System.out.println("===== INVENTORY =====");
        for (Product p : inventory) {
            System.out.println(p.name + " | " + p.category + " | $" + p.price + " | " + p.extraInfo);
        }
    }
    
    public void addToCart(String productName) {
        for (Product p : inventory) {
            if (p.name.equalsIgnoreCase(productName)) {
                cart.add(p);
                System.out.println(productName + " added to cart.");
                return;
            }
        }
        System.out.println("Product not found.");
    }

    public void removeFromCart(String productName) {
        for (Product p : cart) {
            if (p.name.equalsIgnoreCase(productName)) {
                cart.remove(p);
                System.out.println(productName + " removed from cart.");
                return;
            }
        }
        System.out.println("Product not found in cart.");
    }

    public void showCart() {
        System.out.println("===== CART =====");
        for (Product p : cart) {
            System.out.println(p.name + " - $" + p.price);
        }
    }

    public double calculateTotal() {
        double total = 0;
        for (Product p : cart) {
            total += p.price;
        }
        return total;
    }
    
    public void processCreditCardPayment(Customer customer) {
        double total = calculateTotal();
        System.out.println("Processing Credit Card payment for " + customer.name);
        System.out.println("Charged: $" + total);
    }

    public void processPaypalPayment(Customer customer) {
        double total = calculateTotal();
        System.out.println("Processing PayPal payment for " + customer.name);
        System.out.println("Charged: $" + total);
    }

    public void processBankTransfer(Customer customer) {
        double total = calculateTotal();
        System.out.println("Processing Bank Transfer for " + customer.name);
        System.out.println("Charged: $" + total);
    }
    
    public void shipByJNE(Customer customer) {
        System.out.println("Shipping via JNE to " + customer.address);
    }

    public void shipByJNT(Customer customer) {
        System.out.println("Shipping via J&T to " + customer.address);
    }

    public void shipBySiCepat(Customer customer) {
        System.out.println("Shipping via SiCepat to " + customer.address);
    }

    public void sendEmail(Customer customer) {
        System.out.println("Sending email to " + customer.email);
    }

    public void sendSMS(Customer customer) {
        System.out.println("Sending SMS to " + customer.phone);
    }

    public void sendWhatsApp(Customer customer) {
        System.out.println("Sending WhatsApp to " + customer.phone);
    }
    
    public void printInvoice(Customer customer) {
        System.out.println("===== INVOICE =====");
        System.out.println("Customer: " + customer.name);
        for (Product p : cart) {
            System.out.println(p.name + " - $" + p.price);
        }
        System.out.println("TOTAL: $" + calculateTotal());
    }

    public void printSalesReport() {
        System.out.println("===== SALES REPORT =====");
        System.out.println("Total items sold: " + cart.size());
        System.out.println("Revenue: $" + calculateTotal());
    }
    
    public void saveOrderToMySQL() {
        System.out.println("Saving order to MySQL database...");
    }

    public void saveOrderToMongoDB() {
        System.out.println("Saving order to MongoDB database...");
    }
    
    public void checkout(Customer customer, String paymentMethod, String shippingMethod, String notificationMethod) {

        // Payment
        if (paymentMethod.equalsIgnoreCase("creditcard")) {
            processCreditCardPayment(customer);
        } else if (paymentMethod.equalsIgnoreCase("paypal")) {
            processPaypalPayment(customer);
        } else if (paymentMethod.equalsIgnoreCase("banktransfer")) {
            processBankTransfer(customer);
        }

        // Shipping
        if (shippingMethod.equalsIgnoreCase("jne")) {
            shipByJNE(customer);
        } else if (shippingMethod.equalsIgnoreCase("jnt")) {
            shipByJNT(customer);
        } else if (shippingMethod.equalsIgnoreCase("sicepat")) {
            shipBySiCepat(customer);
        }

        // Notification
        if (notificationMethod.equalsIgnoreCase("email")) {
            sendEmail(customer);
        } else if (notificationMethod.equalsIgnoreCase("sms")) {
            sendSMS(customer);
        } else if (notificationMethod.equalsIgnoreCase("whatsapp")) {
            sendWhatsApp(customer);
        }

        printInvoice(customer);
        saveOrderToMySQL();
    }
}