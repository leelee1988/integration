package welcome;

// break simply makes the loop terminate and the program control resumes at the next statement following the loop.
public class DoLoopDemo {
	/*
	 * Leemarie Collet
	 */
	public static void main(String[] args) {
		int x = 1;

		while (x < 5) {
			System.out.println("The value of x : " + x);
			x++;
			System.out.println("\n");
			break;
		}

	}

}
