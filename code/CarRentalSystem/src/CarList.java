import java.util.ArrayList;
import java.util.Scanner;

public class CarList {
	public Scanner sc = new Scanner(System.in);
	public ArrayList<Car> list = new ArrayList<>();
	
	public void insert() {
		// TODO Auto-generated method stub
		String type, name, brand, year;
		
		System.out.print("Type: ");
		type = sc.nextLine();
		
		System.out.print("Name: ");
		name = sc.nextLine();
		
		System.out.print("Brand: ");
		brand = sc.nextLine();
		
		System.out.print("Year: ");
		year = sc.nextLine();
		
		if (type.equalsIgnoreCase("Sedan")) add(new Sedan(brand, year, name));
		else if (type.equalsIgnoreCase("SUV")) add(new SUV(brand, year, name));
		else if (type.equalsIgnoreCase("Truck")) add(new Truck(brand, year, name));
		else System.out.println("Invalid type!");
	}
	
	public void rent() {
		// TODO Auto-generated method stub
		displayAvail();
		
		System.out.print("Index: ");
		int idx = sc.nextInt();
		sc.nextLine();
		
		System.out.print("Days: ");
		int days = sc.nextInt();
		sc.nextLine();
		
		if (days <= 0) {
		    System.out.println("Days must be >= 1");
		    return;
		}
		
		Car target = findAvail(idx);
		if (target == null) {
	        System.out.println("Invalid index!");
	        return;
	    }
		target.setAvail(false);
		
		System.out.println("Price: " + target.calculatePrice(days));
	}
	
	public void returnCar() {
		// TODO Auto-generated method stub
		displayRent();
		
		System.out.print("Index: ");
		int idx = sc.nextInt();
		sc.nextLine();
		
		Car target = findRent(idx);
		if (target == null) {
		    System.out.println("Invalid index!");
		    return;
		}
		target.setAvail(true);
	}
	
	public void remove() {
		// TODO Auto-generated method stub
		displayAll();
		
		System.out.print("Index: ");
		int idx = sc.nextInt();
		sc.nextLine();
		
		if (idx < 1 || idx > list.size()) {
		    System.out.println("Invalid index!");
		    return;
		}
		
		list.remove(idx - 1);
	}
	
	private void add(Car car) {
		// TODO Auto-generated method stub
		list.add(car);
	}
	
	private void displayAll() {
		// TODO Auto-generated method stub
		int i = 1;
		for (Car car : list) {
			System.out.printf("%d. Name: %s, Brand: %s, Year: %s\n", i++, car.getName(), car.getBrand(), car.getYear());
		}
		if (i == 1) System.out.println("No available cars!");
	}
	
	private void displayAvail() {
		// TODO Auto-generated method stub
		int i = 1;
		for (Car car : list) {
			if(car.isAvail()) System.out.printf("%d. Name: %s, Brand: %s, Year: %s\n", i++, car.getName(), car.getBrand(), car.getYear());
		}
		if (i == 1) System.out.println("No available cars!");
	}
	
	private void displayRent() {
		// TODO Auto-generated method stub
		int i = 1;
		for (Car car : list) {
			if(!car.isAvail()) System.out.printf("%d. Name: %s, Brand: %s, Year: %s\n", i++, car.getName(), car.getBrand(), car.getYear());
		}
		if (i == 1) System.out.println("No available cars!");
	}
	
	private Car findAvail(int idx) {
	    int i = 1;
	    for (Car car : list) {
	        if (car.isAvail()) {
	            if (i == idx) return car;
	            i++;
	        }
	    }
	    return null;
	}

	private Car findRent(int idx) {
	    int i = 1;
	    for (Car car : list) {
	        if (!car.isAvail()) {
	            if (i == idx) return car;
	            i++;
	        }
	    }
	    return null;
	}
	
}
