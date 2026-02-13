
public class Item {
	private String id, name, brand;
	private double price;
	private int qty;
	
	public Item(String id, String name, String brand, double price, int qty) {
		this.id = id;
		this.name = name;
		this.brand = brand;
		this.price = price;
		this.qty = qty;
	}
	
	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	

}