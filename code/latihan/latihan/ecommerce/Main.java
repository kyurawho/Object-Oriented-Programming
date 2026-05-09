public class Main {
    public static void main(String[] args) {

        EcommerceSystem system = new EcommerceSystem();

        // Add products
        system.addElectronicsProduct("Gaming Laptop", 1500, 24);
        system.addFoodProduct("Bengbeng", 5, "2027-01-01");
        system.addFashionProduct("Jacket", 120, "L");

        // Show inventory
        system.showInventory();

        // Customer
        Customer customer = new Customer(
                "Bibi",
                "bibi@email.com",
                "08123456789",
                "Jakarta, Indonesia"
        );

        // Shopping cart
        system.addToCart("Gaming Laptop");
        system.addToCart("Premium Jacket");
        system.showCart();

        // Checkout
        system.checkout(
                customer,
                "creditcard",
                "jne",
                "email"
        );

        // Reporting
        system.printSalesReport();
    }
}
