import java.util.ArrayList;
import java.util.Scanner;
public class Main {
	static int i;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Plant> list = new ArrayList<>();
		
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
			sc.nextLine(); // getchar()
			switch(ch) {
			case 1:
				String type;
				
				do {
					System.out.printf("Choose Type (All/Flower/Tree/Houseplant): ");
					type = sc.nextLine();					
				}while(!type.equalsIgnoreCase("All") &&
						!type.equalsIgnoreCase("Flower") &&
						!type.equalsIgnoreCase("Tree") &&
						!type.equalsIgnoreCase("Houseplant"));
				
				if(list.isEmpty()) System.out.println("No plant!");
				else display(list, type);
				
				break;
			case 2:
				String type, sName, name;
				int time;
				
				do {
					System.out.print("Type (Flower/Tree/Houseplant): ");
					type = sc.nextLine();
				}while(!type.equals("Flower") && !type.equals("Tree") && !type.equals("Houseplant"));
				
				do {
					System.out.print("Scientific Name (5 - 30 characters): ");
					sName = sc.nextLine();
				}while(sName.length() < 5 || sName.length() > 30);
				
				do {
					System.out.printf("Name (end with %s): ", type);
					name = sc.nextLine();
				}while(!name.endsWith(type));
				
				do {
					System.out.print("Growth Time (1 - 10 day(s)): ");
					time = sc.nextInt();
				}while(time < 1 || time > 10);
				
				Plant plant = new Plant(type, sName, name, time);
				list.add(plant);
				break;
			case 3:
				if(list.isEmpty()) {
					System.out.println("No plant!");
					break;
				} else {
					display(list, "All");
				}
				
				int del;
				
				do {
					System.out.printf("Choose plant to delete (1 - %d) : ", list.size());
					del = sc.nextInt();
				}while(del < 1 || del > list.size());
				
				list.remove(del - 1);
				
				break;
			case 4:
				for (Plant plant1 : list) {
					if(plant1.getTime() == 0) {
						System.out.printf("%s - Plant is matured\n", plant1.getName());
					} else {
						plant1.setTime(plant1.getTime() - 1);
						System.out.printf("%s - Mature in %d day(s)\n", plant1.getName(), plant1.getTime());
					}
				}
				break;
			case 5:
				System.out.println("Exiting...");
				break;
			default:
				break;
			}
		}
	}
	
	public static void display(ArrayList<Plant> list, String type) {
		i = 1;
		for (Plant plant : list) {
			if(plant.getType().equals(type) || type.equals("All")) {
				System.out.printf("%02d. %s - %s - %s - mature in %d day(s)\n", i++, plant.getType(), plant.getName(), plant.getsName(), plant.getTime());				
			}
		}
		if(i == 1) System.out.println("No plants!");
	}
}