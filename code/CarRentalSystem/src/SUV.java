
public class SUV extends Car{

	public SUV(String brand, String year, String name) {
		super(brand, year, name);
		// TODO Auto-generated constructor stub
	}
	
	public int calculatePrice(int days) {
		// TODO Auto-generated method stub
		return 80 + (days - 1) * 75;
	}

}
