
public class Coffee extends Beverage{
	private String beanType;

	public Coffee(String name, double price, String beanType) {
		super(name, price);
		this.beanType = beanType;
	}

	public String getBeanType() {
		return beanType;
	}
}
