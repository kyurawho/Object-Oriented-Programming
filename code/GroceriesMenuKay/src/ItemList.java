import java.util.ArrayList;

public class ItemList {
	private ArrayList<Item> items = new ArrayList<Item>();
	
	public void addItem(String idItem, String nameItem, String brandItem, double price, int qty) {
		for (Item item : items) {
			if (item.getId().equals(idItem)) {
				System.out.println("[!] Not Successfully Insert New Item to Store");
				return;
			}
		}
		Item temp = new Item (idItem, nameItem, brandItem, price, qty);
		items.add(temp);
		System.out.println("[!] Successfully Insert New Item to Store");
		return;
	}
	
	public void removeItem (String id) {
		for (int i = 0; i < items.size(); i++) {
			Item item = items.get(i);
			if (item.getId().equals(id)) {
				items.remove(i);
				System.out.println("[!] Successfully Removed Item from Store");
				return ;
			}
		}
		System.out.println("[!] Do Not Successfully Remove Item From Store");
		return;
	}
	
	public void updateItem (String id, String name, String brand, double Price, int qty) {
		for (Item item : items) {
			if (item.getId().equals(id)) {
				item.setName(name);
				item.setBrand(brand);
				item.setPrice(Price);
				item.setQty(qty);
				 System.out.println("[!] Successfully Changed Item Information");
				return;
			}
		}
		System.out.println("[!] Do Not Successfully Changed Item Information");
		return;
	}
	
	public Item findItem (String id) {
		for (Item item : items) {
			if (item.getId().equals(id)) {
				return item;
			}
		}
		return null;
	}
	
	public ArrayList<Item> getAllItems(){
		return new ArrayList<Item>(items);
	}
	
	public int getItemListSize() {
		return items.size();
	}
	
	public boolean isItemExist(String id) {
		for (Item item : items) {
			if (item.getId().equals(id)) return true;
		}
		return false;
	}
	
	public void viewAll() {
		for (Item item : items) {
			System.out.println(item.getName()+" - "+item.getBrand()+" - "+item.getPrice()+" - "+item.getQty());
		}
		return;
	}
	
	
}