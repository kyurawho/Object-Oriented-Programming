abstract class Product {
    String name;
    String category;
    double price;
    String extraInfo;

    public Product(String name, String category, double price, String extraInfo) {
        this.name = name;
        this.category = category;
        this.price = price;
        this.extraInfo = extraInfo;
    }
}

class ElectronicProduct extends Product {
    public ElectronicProduct(String name, double price, int warrantyMonths) {
        super(name, "Electronics", price, "Warranty: " + warrantyMonths + " months");
    }
}

class FoodProduct extends Product {
    public FoodProduct(String name, double price, String expiryDate) {
        super(name, "Food", price, "Expiry: " + expiryDate);
    }
}

class FashionProduct extends Product {
    public FashionProduct(String name, double price, String size) {
        super(name, "Fashion", price, "Size: " + size);
    }
}