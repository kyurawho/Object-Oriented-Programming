import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1. Dog");
		System.out.println("2. Cat");
		System.out.println("3. Bird");
		System.out.println("Choose pet: ");
		int choice = sc.nextInt();
		sc.nextLine();
		
		
		Pet pet;
		
		if(choice == 1) {
			pet = new Dog();
		}
		else if(choice == 2) {
			pet = new Cat();
		}
		else{
			pet = new Bird();
		}
		
		
		while(!pet.isDead()) {
			pet.menu();
			System.out.print("Choose: ");
			
			int choice2 = sc.nextInt();
			sc.nextLine();
			
			pet.action(choice2);
			
			System.out.println("");
			pet.isLevelUp();
		}
		
		
		System.out.println("Game Over");
		System.out.printf("You survive for %d day(s)\n", pet.day);
		System.out.printf("Last Level: %d\n", pet.level);
		
	}

}
