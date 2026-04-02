
public class Truck extends Car{

	public Truck(String brand, String year, String name) {
		super(brand, year, name);
		// TODO Auto-generated constructor stub
	}

	public int calculatePrice(int days) {
		// TODO Auto-generated method stub
		return 120 + (days - 1) * 115;
	}
}
