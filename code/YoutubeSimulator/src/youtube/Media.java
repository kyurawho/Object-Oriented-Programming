package youtube;

public abstract class Media {
	private String title;
	private String description;
	private int duration;
	private int playTime;
	private boolean played;
	
	public Media(String title, String description, int duration) {
		super();
		this.title = title;
		this.description = description;
		this.duration = duration;
		this.playTime = 0;
		this.played = false;
	}
	
	public abstract void showInfo();
	public abstract void showHistory();
	public abstract void play();

	public String getTitle() { return title; }
	public String getDescription() { return description; }
	public int getDuration() { return duration; }
	public int getPlayTime() { return playTime; }
	public void setPlayTime(int playTime) { this.playTime = playTime; }
	public boolean isPlayed() { return played; }
	public void setPlayed(boolean played) { this.played = played; }
}
