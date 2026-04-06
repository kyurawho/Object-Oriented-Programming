package youtube;

public interface Skipable {
	public default int skipForward(int playTime, int duration) {
		if(playTime + 5 >= duration) playTime = duration;
		else playTime += 5;
		return playTime;
	}
	
	public default int skipBackward(int playTime) {
		if(playTime - 5 <= 0) playTime = 0;
		else playTime -= 5;
		return playTime;
	}
}
