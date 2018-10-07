package terning;

import java.util.concurrent.ThreadLocalRandom;

public class Dice {

	/*

	Alternative solution using math.random.
	Public int roll() {
	float d1 = (float) Math.random(); // generates a float between 0-1
	float d2 = d1 * 6; 				  // multiplies that float by 6 to get a float between 0-6
	return (int)Math.ceil(d2);       // uses Math.ceil() and typecasts to int to get an int between 1-6.


	}
	 */
	// roll the die and return the value (1-6)
	public int roll() {
	    int min = 1;
	    int max = 6;
		int rollResult = ThreadLocalRandom.current().nextInt(min, max +1);
		return rollResult;
	}

	// roll the die n times and print the values
	public void rollMultiple(int n) {
		for (int i = 1; i < n; i++) {
			System.out.print(roll() + " ");
		}
	}
}
