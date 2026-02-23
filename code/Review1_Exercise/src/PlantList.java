import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.text.View;

public class PlantList {
	private ArrayList<Plant> plants;
	Scanner sc = new Scanner(System.in);

	public PlantList() {
		plants = new ArrayList<>();
	}
	
	public void addPlant(Plant p) {
		// TODO Auto-generated method stub
		plants.add(p);
	}
	
	public void view() {
		// TODO Auto-generated method stub
		String type;
		do {
			System.out.print("Choose type (All/Flower/Tree/Houseplant): ");
			type = sc.nextLine();
		}while(!type.equalsIgnoreCase("all") &&
				!type.equalsIgnoreCase("flower") &&
				!type.equalsIgnoreCase("tree") &&
				!type.equalsIgnoreCase("houseplant"));
		display(type);
	}
	
	public void insert() {
		// TODO Auto-generated method stub
		String type, sName, name;
		int time;
		
		do {
			System.out.print("Type (Flower/Tree/Houseplant): ");
			type = sc.nextLine();
		}while(!type.equals("Flower") && !type.equals("Tree") && !type.contains("Houseplant"));
		
		do {
			System.out.print("Scientific Name (5 - 30 characters): ");
			sName = sc.nextLine();
		}while(sName.length() < 5 || sName.length() > 30);
		
		do {
			System.out.print("Name (end with Flower): ");
			name = sc.nextLine();
		}while(!name.endsWith("Flower"));

		do {
			System.out.print("Growth time (1-10 day(s)): ");
			time = sc.nextInt();
		}while(time < 1 || time > 10);
		
		Plant plant = new Plant(type, sName, name, time);
		plants.add(plant);
	}
	
	public void delete() {
		// TODO Auto-generated method stub
		if(plants.size() == 0) {
			System.out.println("No plants!");
			return;
		}
		display("All");
		System.out.printf("Choose plant to water (1-%d): ", plants.size());
		
		int ch = -1;
		ch = sc.nextInt();
		
		plants.remove(ch);		
	}
	
	public void water() {
		// TODO Auto-generated method stub
		if(plants.size() == 0) {
			System.out.println("No plants!");
			return;
		}
		display("All");
		System.out.printf("Choose plant to water (1-%d): ", plants.size());
		
		int ch = -1;
		ch = sc.nextInt();
		
		if(plants.get(ch).getTime() == 0) {
			System.out.println("Plant is considered mature");
		}else {
			plants.get(ch).setTime(plants.get(ch).getTime() - 1);
			System.out.printf("Mature in %d day(s)\n", plants.get(ch).getTime());
		}
	}
	
	private void display(String type) {
		// TODO Auto-generated method stub
		if(plants.size() == 0) {
			System.out.println("No plants!");
			return;
		}
		
		int i = 1;
		for (Plant plant : plants) {
			if(plant.getType().equals(type) || type.equalsIgnoreCase("All")) {
				System.out.printf("%02d. %s - %s - %s - mature in %d day(s)\n", i++, plant.getType(), plant.getName(), plant.getsName(), plant.getTime());
			}
		}
	}
}
