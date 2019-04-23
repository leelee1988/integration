package welcome;

/**
 * @author Leemarie
 *
 */
public class Methodpt2 {

	public static void main(String[] args) {
		int result, n;

		n = 3;
		result = square(n);
		System.out.println("The square of 3 is: " + result);

		n = 4;
		result = square(n);
		System.out.println("The square of 4 is: " + result);
	}

	static int square(int i) {
		// "I" is what we call an parameter.
		// "square(int i)" is what we call an argument
		return i * i;
	}
}
