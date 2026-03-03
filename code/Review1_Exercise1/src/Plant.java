
public class Plant {
	private String type;
	private String sName;
	private String name;
	private int time;
	
	public Plant(String type, String sName, String name, int time) {
		this.type = type;
		this.sName = sName;
		this.name = name;
		this.time = time;
	}
	
	public String getType() {
		return type;
	}
	
	public void setTime(int time) {
		this.time = time;
	}
	
	public String getName() {
		return name;
	}
	
	public String getsName() {
		return sName;
	}
	
	public int getTime() {
		return time;
	}
}
