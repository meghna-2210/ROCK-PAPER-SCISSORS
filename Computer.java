package rock_paper_scissors;
import java.util.Random;

public class Computer {
	public int getInput() {
		Random random = new Random();
		int input = random.nextInt(3) + 1;
		return input;
	}
}
