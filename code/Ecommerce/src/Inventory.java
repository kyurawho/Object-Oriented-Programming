import java.util.ArrayList;

class Inventory {
    private ArrayList<Product> products = new ArrayList<>();

    public void add(Product p) {
        products.add(p);
        System.out.println(p.category + " product added: " + p.name);
    }

    public ArrayList<Product> getAll() {
        return products;
    }

    public Product findByName(String name) {
        return products.stream()
                .filter(p -> p.name.equalsIgnoreCase(name))
                .findFirst()
                .orElse(null);
    }
}