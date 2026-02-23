import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PlantList list = new PlantList();
		
		Scanner sc = new Scanner(System.in);
		
		int ch = -1;
		
		while(ch != 5) {
			System.out.println("--Binus Plant Collections--");
			System.out.println("1. View plants");
			System.out.println("2. Insert plant");
			System.out.println("3. Delete plant");
			System.out.println("4. Water plants");
			System.out.println("5. Exit");
			
			System.out.print(">> ");
			ch = sc.nextInt();
			sc.nextLine();

			switch(ch) {
			case 1:
				list.view();
				break;
			case 2:
				list.insert();
				break;
			case 3:
				list.delete();
				break;
			case 4:
				list.water();
				break;
			case 5:
				System.out.println("Exiting...");
				break;
			default:
				break;
			}
		}
	}

}


