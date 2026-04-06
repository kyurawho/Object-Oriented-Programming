package youtube;

import java.util.Scanner;

public class VideoFile extends Media implements Skipable {
	
	private Scanner sc = new Scanner(System.in);
	
	public VideoFile(String title, String description, int duration) {
		super(title, description, duration);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void showInfo() {
		// TODO Auto-generated method stub
		System.out.printf("Video: %s (%02d:%02d)\n", getTitle(), getDuration() / 60, getDuration() % 60);
	}

	@Override
	public void play() {
		// TODO Auto-generated method stub
		int option = -1;
		
		if(getPlayTime() + 10 >= getDuration()) setPlayTime(getDuration());
		else setPlayTime(getPlayTime() + 10);
		do {
			System.out.println("Now Playing: " + getTitle());
			System.out.println(getDescription());
			System.out.print("Current play at ");
			System.out.printf("%02d:%02d/%02d:%02d\n\n", getPlayTime() / 60, getPlayTime() % 60
					, getDuration() / 60, getDuration() % 60);
			
			System.out.print("Choose (0: back|1: skip forward|2: skip backward): ");
			option = sc.nextInt();
			sc.nextLine();
			
			if(option == 1) setPlayTime(skipForward(getPlayTime(), getDuration()));
			else if(option == 2) setPlayTime(skipBackward(getPlayTime()));
			
		}while(option != 0);
	}

	@Override
	public void showHistory() {
		// TODO Auto-generated method stub
		System.out.printf("Video: %s (played at %02d:%02d)\n", getTitle(), getPlayTime() / 60, getPlayTime() % 60);
	}

}
