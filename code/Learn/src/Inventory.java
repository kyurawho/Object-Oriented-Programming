import java.util.ArrayList;

public class Inventory {
	private ArrayList<Item> items;
	
	//constructor that doesn't need any parameter, because we will make an empty inventory at the first
	public Inventory() {
		items = new ArrayList<>();
	}
	
	public void addItem(Item item) {
		items.add(item);
	}
	
	public void displayItem() {
		for(Item item : items){
			System.out.println(item.toString());
		}
	}
	
	public void displayItem(String type) {
		for(Item item : items) {
			if(item instanceof Fruit && ((Fruit) item).getType().equalsIgnoreCase(type)) {
				System.out.println(item.toString());
			}else if(item instanceof Weapon && ((Weapon) item).getType().equalsIgnoreCase(type)) {
				System.out.println(item.toString());				
			}
		}
	}
}
