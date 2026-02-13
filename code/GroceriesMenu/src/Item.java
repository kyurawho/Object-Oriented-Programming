
public class Item {
	private static int nextId = 1;
	
	private final String id;
	private String name;
	private String brandName;
	private int price;
	private int quantity;
	
	public Item(String name, String brandName, int price, int quantity) {
		id = "Item" + String.format("%03d", nextId++);
		this.name = name;
		this.brandName = brandName;
		this.price = price;
		this.quantity = quantity;
	}

	public String getId() { return id; }
	public String getName() { return name; }
	public String getBrandName() { return brandName; }
	public int getPrice() { return price; }
	public int getQuantity() { return quantity; }
	
	public void updateInfo(String name, String brandName, int price, int quantity) {
		this.name = name;
		this.brandName = brandName;
		this.price = price;
		this.quantity = quantity;
	}
}
