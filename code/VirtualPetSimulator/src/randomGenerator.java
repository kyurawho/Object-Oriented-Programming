import java.util.Random;

public class randomGenerator {
	static Random r = new Random();
	public static int random(int min, int max) {
		return r.nextInt(max - min + 1) + min;
	}
}
