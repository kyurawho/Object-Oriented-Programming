import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		ArrayList<Grocery> groceries = new ArrayList<Grocery>();
		
		Scanner sc = new Scanner(System.in);
		
		int choice = 0;
		while(choice != 7) {
			System.out.println("1. Insert new grocery");
			System.out.println("2. Insert new item to grocery");
			System.out.println("3. Update grocery name");
			System.out.println("4. Update item information");
			System.out.println("5. Remove item");
			System.out.println("6. Remove grocery");
			System.out.println("7. Exit");
			System.out.print(">> ");
			choice = sc.nextInt();
			sc.nextLine();
			
			switch(choice) {
			case 1:
				int maxNumItem;
				String store;
				
				System.out.print("Enter store name : ");
				store = sc.nextLine();
				
				System.out.print("Enter max number of item : ");
				maxNumItem = sc.nextInt();
				sc.nextLine();
				
				groceries.add(new Grocery(store, maxNumItem));
				
				System.out.println("Store added successfully!");
				break;
			case 2:
				boolean groceriesFound2 = Main.display(groceries);
				if(!groceriesFound2) break;
				
				System.out.print("Enter store id >> ");
				String storeName = sc.nextLine();
				
				Grocery target = Main.findStore(groceries, storeName);
				
				if(target == null) System.out.println("Store not found!");
				else {
					String item, brand;
					int price, quantity;
					
					System.out.print("Enter item name : ");
					item = sc.nextLine();
					
					System.out.print("Enter brand name : ");
					brand = sc.nextLine();
					
					System.out.print("Enter price : ");
					price = sc.nextInt();
					sc.nextLine();
					
					System.out.print("Enter quantity : ");
					quantity = sc.nextInt();
					sc.nextLine();
					
					target.addItem(item, brand, price, quantity);
				}
				break;
			case 3:
				boolean groceriesFound3 = Main.display(groceries);
				if(!groceriesFound3) break;
				
				System.out.print("Enter store id >> ");
				String storeName1 = sc.nextLine();
				
				Grocery target1 = Main.findStore(groceries, storeName1);
				if(target1 == null) System.out.println("Store not found!");
				else {
					String newStoreName;
					System.out.print("Enter new store name : ");
					newStoreName = sc.nextLine();
					
					target1.updateStore(newStoreName);			
				}
				
				break;
			case 4:
				boolean groceriesFound4 = Main.display(groceries);
				if(!groceriesFound4) break;
				
				System.out.print("Enter store id >> ");
				String storeName2 = sc.nextLine();
				
				Grocery target2 = Main.findStore(groceries, storeName2);
				if(target2 == null) System.out.println("Store not found!");
				else {
					boolean itemFound = target2.display();
					if(!itemFound) break;
					
					System.out.print("Enter item id >> ");
					String itemName2 = sc.nextLine();
					Item item = target2.findItem(itemName2);
					
					if(item == null) System.out.println("item not found or list is empty!");
					else {		
						String item1, brand1;
						int price1, quantity1;
						
						System.out.print("Enter item name : ");
						item1 = sc.nextLine();
						
						System.out.print("Enter brand name : ");
						brand1 = sc.nextLine();
						
						System.out.print("Enter price : ");
						price1 = sc.nextInt();
						sc.nextLine();
						
						System.out.print("Enter quantity : ");
						quantity1 = sc.nextInt();
						sc.nextLine();
						
						item.updateInfo(item1, brand1, price1, quantity1);
					}
				}
				break;
			case 5:
				boolean groceriesFound5 = Main.display(groceries);
				if(!groceriesFound5) break;
				
				System.out.print("Enter store id >> ");
				String storeName3 = sc.nextLine();
				
				Grocery target3 = Main.findStore(groceries, storeName3);
				if(target3 == null) System.out.println("Store not found!");
				else {
					boolean itemFound5 = target3.display();
					if(!itemFound5) break;
					
					System.out.print("Enter item id >> ");
					String itemName = sc.nextLine();
					
					target3.deleteItem(itemName);
				}
				
				break;
			case 6:
				boolean groceriesFound6 = Main.display(groceries);
				if(!groceriesFound6) break;
				
				System.out.print("Enter store id >> ");
				String storeName6 = sc.nextLine();
				
				boolean found = false;
				for (int i = groceries.size() - 1; i >= 0; i--) {
					if (groceries.get(i).getId().equals(storeName6)) {
						groceries.remove(i);
						found = true;
					}
				}
				
				if(found) {
					System.out.println("Store deleted successfully!");
				} else {			
					System.out.println("Store not found!");
				}
				break;
			case 7:
				System.out.println("Exiting...");
				break;
			default:
				System.out.println("Invalid input!");
				break;
			}
		}
	}
	
	public static boolean display(ArrayList<Grocery> groceries) {
		if(groceries.isEmpty()) {
			System.out.println("No store available!");
			return false;
		}
		int cnt = 1;
		for(Grocery grocery : groceries) {
			System.out.println(cnt++ + ". " + grocery.getId() + " || " + grocery.getStore() + " || " + grocery.getMaxNumItem());			
		}
		return true;
	}
	
	public static Grocery findStore(ArrayList<Grocery> groceries, String storeName) {
		for(Grocery grocery : groceries) {
			if(grocery.getId().equals(storeName)) return grocery;
		}
		return null;
	}
	
}
