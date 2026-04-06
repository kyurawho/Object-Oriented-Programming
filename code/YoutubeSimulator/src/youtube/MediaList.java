package youtube;

import java.util.ArrayList;
import java.util.Scanner;

public class MediaList {
	private ArrayList<Media> medias;
	private Scanner sc = new Scanner(System.in);
	private int ch = -1;

	public MediaList() {
		this.medias = new ArrayList<Media>();
	}
	
	public void add() {
		do {
			System.out.println("1. Add Audio File");
			System.out.println("2. Add Video File");
			System.out.println("3. Add Live Stream");
			System.out.println("4. Back");
			System.out.print("Choose: ");
			ch = sc.nextInt();
			sc.nextLine();
			
			switch(ch) {
			case 1:
				addAV();
				break;
			case 2:
				addAV();
				break;
			case 3:
				addLS();
				break;
			case 4:
				System.out.println("Exiting Add Media");
				break;
			default:
				System.out.println("Invalid format");
				break;
			}
		}while(ch != 4);
	}
	
	private void addAV(){
		String title, description;
		int duration;
		
		do {
			System.out.print("Title (3-30 characters): ");
			title = sc.nextLine();
		}while(title.length() < 3 || title.length() > 30);
		
		do {
			System.out.print("Description (5-50 characters): ");
			description = sc.nextLine();
		}while(description.length() < 5 || description.length() > 50);
		
		do {
			System.out.print("Duration (10-999): ");
			duration = sc.nextInt();
			sc.nextLine();
		}while(duration < 10 || duration > 999);
		
		if(ch == 1) medias.add(new AudioFile(title, description, duration));
		else if (ch == 2) medias.add(new VideoFile(title, description, duration));
		
		System.out.println("Media added!");
	}
	
	private void addLS() {
		String title, description;
		
		do {
			System.out.print("Title (3-30 characters): ");
			title = sc.nextLine();
		}while(title.length() < 3 || title.length() > 30);
		
		do {
			System.out.print("Description (5-50 characters): ");
			description = sc.nextLine();
		}while(description.length() < 5 || description.length() > 50);
		
		medias.add(new LiveStream(title, description, 0));
		
		System.out.println("Media added!");
	}
	
	public void play() {
		int i = 1;
		for (Media media : medias) {
			System.out.printf("[%d] ", i++);
			media.showInfo();
		}
		
		System.out.print("Choose index: ");
		ch = sc.nextInt();
		sc.nextLine();
		
		medias.get(ch - 1).setPlayed(true);
		medias.get(ch - 1).play();
	}
	
	public void history() {
		int i = 1;
		for (Media media : medias) {
			if(media.isPlayed()) {
				System.out.printf("[%d] ", i++);
				media.showHistory();				
			}
		}
	}
}
