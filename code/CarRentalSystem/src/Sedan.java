
public class Sedan extends Car{
	public Sedan(String brand, String year, String name) {
		super(brand, year, name);
	}

	public int calculatePrice(int days) {
		// TODO Auto-generated method stub
		return 50 + (days - 1) * 30;
	}

}
