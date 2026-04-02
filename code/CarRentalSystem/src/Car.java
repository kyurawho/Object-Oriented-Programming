
public class Car {
	private String brand;
	private String year;
	private String name;
	private boolean avail;

	public Car(String brand, String year, String name) {
		this.brand = brand;
		this.year = year;
		this.name = name;
		this.avail = true;
	}
	
	public int calculatePrice(int days) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	public String getBrand() {
		return brand;
	}
	
	public String getYear() {
		return year;
	}
	
	public String getName() {
		return name;
	}

	public boolean isAvail() {
		return avail;
	}
	
	public void setAvail(boolean avail) {
		this.avail = avail;
	}
}

