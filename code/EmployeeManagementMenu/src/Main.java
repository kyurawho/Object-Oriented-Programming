import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int choice = 0;
		
		Scanner sc = new Scanner(System.in);
		
		List list = new List();
		
		while(choice != 3) {
			System.out.println("1. Insert employee data");
			System.out.println("2. View all Employees");
			System.out.println("3. Exit");
			System.out.print(">> ");
			choice = sc.nextInt();
			sc.nextLine();
			
			switch(choice) {
				case 1:
					String ip;
					int size;
					do {
						System.out.print("Enter employee (name;email): ");
						ip = sc.nextLine();
						
						String[] sp = ip.split(";");
						size = sp.length;
						
						if(!ip.contains("@")) System.out.println("Invalid email! Must contain '@'.");
						if(!ip.contains(";")) System.out.println("Invalid format! Must contain ';'.");
						if(size != 2) System.out.println("Must contain only 1 ';'");
					}while (!ip.contains("@") || !ip.contains(";") || size != 2);
					
					String[] sp = ip.split(";");
					
					
					Employee employee = new Employee(sp[0], sp[1]);
					list.addList(employee);
					
					System.out.println("Data saved.");
					break;
				case 2:
					System.out.println("List of employees: ");
					list.getList();
					break;
				case 3:
					System.out.println("Exiting...");
					break;
				default:
					System.out.println("Wrong input");
					break;
			}
			
		}
	}

}
