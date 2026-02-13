import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		ArrayList<Item> felisKeren = new ArrayList<Item>();
		
		
		Scanner sc = new Scanner(System.in);
		
		int a;
		
		a = sc.nextInt();
		
		String s;
		
		s = sc.nextLine();
		
		int choice = 0;
		
		choice = sc.nextInt();
		sc.nextLine(); //getchar()
		
		Item item = new Fruit("Apel", 10, "Fuji");
		Item item2 = new Item("Charger", 2);
		Item item3 = new Fruit("Jeruk", 20, "Bali");
		Item item4 = new Fruit("Duren", 5, "Musang king");
		felisKeren.add(item);
	}
}
