import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int choice = 0;
		
		Scanner sc = new Scanner(System.in);
		
		HashSet<String> list = new HashSet<String>();
		ArrayList<String> lists = new ArrayList<String>();
		
		while(choice != 5) {
			System.out.println("1. Add Item");
			System.out.println("2. Remove Item");
			System.out.println("3. Search Item");
			System.out.println("4. View Item");
			System.out.println("5. Exit");
			System.out.print(">> ");
			
			choice = sc.nextInt();
			sc.nextLine();
			
			switch(choice) {
			case 1:
				String s;
				do {
					System.out.print("Enter item name: ");
					s = sc.nextLine().trim();
					if(list.contains(s)) System.out.println("Item already exists!");
					if(s.length() == 0) System.out.println("Name cannot be empty!");
				}while(list.contains(s) || s.length() == 0);
				list.add(s);
				lists.add(s);
				System.out.println("Item added!");
				break;
				
			case 2:
				String s1;
				do {
					System.out.print("Enter item to remove: ");
					s1 = sc.nextLine();
					if(!list.contains(s1)) System.out.println("Item not found!");
				}while(!list.contains(s1));
				
				list.remove(s1);
				lists.remove(s1);
				System.out.println(s1 + " removed!");
				break;
				
			case 3:
				String s2;
				System.out.print("Enter search keyword: ");
				s2 = sc.nextLine();
				
				System.out.println("Search results:");
				boolean flag = false;
				for(String x : list) {
					if(x.startsWith(s2)) {
						System.out.println("- " + x);
						flag = true;
					}
				}
				
				if(!flag) System.out.println("No items match your search.");
				break;
			
			case 4:
				System.out.println("Your Grocery List:");
				int cnt = 1;
				for(String x : lists) {
					System.out.println(cnt++ + ". " + x);
				}
				System.out.println("Total item(s): " + --cnt);
				break;
				
			case 5:
				System.out.println("Exiting...");
				break;
				
			default:
				System.out.println("Invalid choice");
				break;
			}
		}
	}

}
