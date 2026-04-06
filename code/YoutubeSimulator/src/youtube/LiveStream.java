package youtube;

import java.util.Scanner;

public class LiveStream extends Media {
	
	private Scanner sc = new Scanner(System.in);
	
	public LiveStream(String title, String description, int duration) {
		super(title, description, duration);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void showInfo() {
		// TODO Auto-generated method stub
		System.out.println("LiveStream: " + getTitle());
	}

	@Override
	public void play() {
		// TODO Auto-generated method stub
		int option = -1;
		do {
			System.out.println("Now Playing: " + getTitle());
			System.out.println(getDescription());
			
			System.out.print("Choose (0: back): ");
			option = sc.nextInt();
			sc.nextLine();			
		}while(option != 0);
	}

	@Override
	public void showHistory() {
		// TODO Auto-generated method stub
		showInfo();
	}

}
