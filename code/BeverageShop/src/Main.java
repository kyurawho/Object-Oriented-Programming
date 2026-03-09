import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BeverageList bvl = new BeverageList();
		
		int ch = -1;
		Scanner sc = new Scanner(System.in);
		
		while(ch != 4) {
			System.out.println("1. Insert");
			System.out.println("2. Delete");
			System.out.println("3. View all");
			System.out.println("4. Exit");
			System.out.print(">> ");
			ch = sc.nextInt();
			sc.nextLine();
			
			switch(ch) {
			case 1:
				System.out.println("1. Coffee");
				System.out.println("2. Tea");
				System.out.println("3. Juice");
				System.out.println("4. Exit");
				System.out.print(">> ");
				int ch1 = sc.nextInt();
				sc.nextLine();
				
				if(ch1 == 4) break;
				else {
					String name, add;
					int price;
					System.out.print("Name : ");
					name = sc.nextLine();
					System.out.print("Price : ");
					price = sc.nextInt();
					sc.nextLine();
					
					if(ch1 == 1) {
						System.out.print("Bean type : ");
						add = sc.nextLine();
						Coffee coffee = new Coffee(name, price, add);
						bvl.addCoffee(coffee);
					}
					if(ch1 == 2) {
						System.out.print("Tea type : ");
						add = sc.nextLine();
						Tea tea = new Tea(name, price, add);
						bvl.addTea(tea);
					}
					if(ch1 == 3) {
						System.out.print("Fruit : ");
						add = sc.nextLine();
						Juice juice = new Juice(name, price, add);
						bvl.addJuice(juice);
					}
				}
				
				System.out.println("Data added successfully");
				
				break;
			case 2:
				System.out.println("1. Coffee");
				System.out.println("2. Tea");
				System.out.println("3. Juice");
				System.out.println("4. Exit");
				System.out.print(">> ");
				int ch2 = sc.nextInt();
				sc.nextLine();
				
				String name;
				
				switch(ch2) {
				case 1:
					if(!bvl.viewCoffee()) break;
					System.out.print("Name : ");
					name = sc.nextLine();
					if(bvl.removeCoffee(name)) System.out.println("Data deleted successfully");
					else System.out.println("Failed to delete data :(");
					break;
				case 2:
					if(!bvl.viewTea()) break;
					System.out.print("Name : ");
					name = sc.nextLine();
					if(bvl.removeTea(name)) System.out.println("Data deleted successfully");
					else System.out.println("Failed to delete data :(");
					break;
				case 3:
					if(!bvl.viewJuice()) break;
					System.out.print("Name : ");
					name = sc.nextLine();
					if(bvl.removeJuice(name)) System.out.println("Data deleted successfully");
					else System.out.println("Failed to delete data :(");
					break;
				case 4:
					break;
				default:
					System.out.println("Invalid input");
					break;
				}
				break;
			case 3:
				bvl.view();
				break;
			case 4:
				System.out.println("Exiting...");
				sc.nextLine();
				break;
			default:
				System.out.println("Invalid input");
				break;	
			}
		}
		
	}

}
