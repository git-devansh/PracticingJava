// random values
import java.util.Random;

public class P007 {
	public static void main(String[] args){
		Random random = new Random();

		int x = random.nextInt(6) + 1;

		// between 0 and 1.
		double y = random.nextDouble();

		boolean z = random.nextBoolean();

		System.out.println(y);
	}
}