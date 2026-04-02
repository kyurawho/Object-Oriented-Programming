import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		CarList list = new CarList();
		
		int ch = -1;
		
		while(ch != 5) {
			System.out.println("1. Insert Car");
			System.out.println("2. Rent Car");
			System.out.println("3. Return Car");
			System.out.println("4. Remove Car");
			System.out.println("5. Exit");
			System.out.print(">> ");
			ch = sc.nextInt();
			sc.nextLine();
			
			switch(ch) {
			case 1:
				list.insert();
				break;
			case 2:
				list.rent();
				break;
			case 3:
				list.returnCar();
				break;
			case 4:
				list.remove();
				break;
			case 5:
				System.out.println("Exiting...");
				break;
			default:
				System.out.println("Invalid format input");
				break;
			}
		}
		
	}

}
