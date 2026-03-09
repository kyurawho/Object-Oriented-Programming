import java.util.ArrayList;

public class BeverageList {
	private ArrayList<Coffee> coffeeList;
	private ArrayList<Tea> teaList;
	private ArrayList<Juice> juiceList;
	
	private int cnt;
	
	public BeverageList() {
		coffeeList = new ArrayList<>();
		teaList = new ArrayList<>();
		juiceList = new ArrayList<>();
	}
	
	public boolean viewCoffee() {
		cnt = 1;	
		System.out.println("Coffee");
		if(coffeeList.isEmpty()) {
			System.out.println("--No data--");
			return false;
		}
		else {
			for (Coffee coffee : coffeeList) {
				System.out.println(cnt++ + ". Name: " + coffee.getName() + "| Price: " + coffee.getPrice() + "| bean type: " + coffee.getBeanType());
			}
		}
		return true;
	}
	
	public boolean viewTea() {
		// TODO Auto-generated method stub
		cnt = 1;
		System.out.println("Tea");
		if(teaList.isEmpty()) {
			System.out.println("--No data--");
			return false;
		}
		else {
			for (Tea tea : teaList) {
				System.out.println(cnt++ + ". Name: " + tea.getName() + "| Price: " + tea.getPrice() + "| bean type: " + tea.getTeaType());
			}
		}
		return true;
	}
	
	public boolean viewJuice() {
		// TODO Auto-generated method stub
		cnt = 1;
		System.out.println("Juice");
		if(juiceList.isEmpty()) {
			System.out.println("--No data--");
			return false;
		}
		else {
			for (Juice juice : juiceList) {
				System.out.println(cnt++ + ". Name: " + juice.getName() + "| Price: " + juice.getPrice() + "| fruit: " + juice.getFruit());
			}
		}
		return true;
	}
	
	public void view() {
		// TODO Auto-generated method stub
		viewCoffee();
		viewTea();
		viewJuice();
	}
	
	public boolean removeCoffee(String name) {
		// TODO Auto-generated method stub
		for (Coffee coffee : coffeeList) {
			if(coffee.getName().equalsIgnoreCase(name)) {
				coffeeList.remove(coffee);
				return true;
			}
		}
		return false;
	}
	
	public boolean removeTea(String name) {
		// TODO Auto-generated method stub
		for (Tea tea : teaList) {
			if(tea.getName().equalsIgnoreCase(name)) {
				teaList.remove(tea);
				return true;
			}
		}
		return false;
	}
	
	public boolean removeJuice(String name) {
		// TODO Auto-generated method stub
		for (Juice juice : juiceList) {
			if(juice.getName().equalsIgnoreCase(name)) {
				juiceList.remove(juice);
				return true;
			}
		}
		return false;
	}
	
	public void addCoffee(Coffee coffee) {
		// TODO Auto-generated method stub
		coffeeList.add(coffee);
	}
	
	public void addTea(Tea tea) {
		// TODO Auto-generated method stub
		teaList.add(tea);
	}
	
	public void addJuice(Juice juice) {
		// TODO Auto-generated method stub
		juiceList.add(juice);
	}
}
