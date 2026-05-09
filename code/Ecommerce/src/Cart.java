import java.util.ArrayList;

class Cart {
    private ArrayList<Product> items = new ArrayList<>();

    public void add(Product p) {
        items.add(p);
        System.out.println(p.name + " added to cart.");
    }

    public void remove(Product p) {
        items.remove(p);
        System.out.println(p.name + " removed from cart.");
    }

    public ArrayList<Product> getItems() {
        return items;
    }

    public double calculateTotal() {
    	double total = 0;
        for (Product p : items) {
            total += p.price;
        }
        return total;
    }
}