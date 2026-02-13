import java.util.ArrayList;

public class Grocery {
	private static int nextId = 1;
	
	private final String id;
	private String store;
	private final int maxNumItem;
	private ArrayList<Item> items;
	
	public Grocery(String store, int maxNumItem) {
		id = "Store" + String.format("%03d", nextId++);
		this.store = store;
		this.maxNumItem = maxNumItem;
		items = new ArrayList<Item>();
	}
	
	public String getId() { return id; }
	public String getStore() { return store; }
	public int getMaxNumItem() { return maxNumItem; }
	
	public void addItem(String name, String brandName, int price, int quantity) {
		if(items.size() >= maxNumItem) {
			System.out.println("Maximum number of items has been reached.");
		} else {
			items.add(new Item(name, brandName, price, quantity));
			System.out.println("Item added successfully!");
		}
	}
	
	// Update store name
	public void updateStore(String store) {
		this.store = store;
		System.out.println("Store name updated to: " + store);
	}
	
	// Delete item
	public void deleteItem(String itemName) {
		boolean found = false;
		for (int i = items.size() - 1; i >= 0; i--) {
            if (items.get(i).getId().equals(itemName)) {
                items.remove(i);
                found = true;
            }
        }
		
		if(found) {
			System.out.println("Item deleted successfully!");
		} else {			
			System.out.println("Item not found!");
		}
	}
	
	// Display items
	public boolean display() {
		if(items.isEmpty()) {
			System.out.println("No items available!");
			return false;
		}
    	int cnt = 1;
    	for(Item item : items) {
    		System.out.println(cnt++ + ". " + item.getId() + " || " + item.getName() + " (" + item.getBrandName() + ") - Rp" + item.getPrice() + " [" + item.getQuantity() + "]");    		
    	}
    	return true;
    }
	
	// Find Item
	public Item findItem(String itemName2) {
    	for(Item item : items) {
    		if(item.getId().equals(itemName2)) return item;
    	}
    	return null;
    }
}
