package youtube;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MediaList list = new MediaList();
		Scanner sc = new Scanner(System.in);
		int ch = -1;
		
		do{
			System.out.println("Youtube");
			System.out.println("-----------------");
			System.out.println("1. Add Media");
			System.out.println("2. Play Media");
			System.out.println("3. Watch History");
			System.out.println("4. Exit");
			System.out.print("Choose: ");
			ch = sc.nextInt();
			sc.nextLine();
			
			switch(ch) {
			case 1:
				list.add();
				break;
			case 2:
				list.play();
				break;
			case 3:
				list.history();
				break;
			case 4:
				System.out.println("Exiting...");
				break;
			default:
				System.out.println("Invalid format");
				break;
			}
		}while(ch != 4);
	}

}
