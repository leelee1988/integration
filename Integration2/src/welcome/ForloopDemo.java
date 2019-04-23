package welcome;

// Continue causes control to immediately jump to the update statement.
public class ForloopDemo {
	/*
	 * Leemarie Collet
	 */
	public static void main(String[] args) {
		int[] numbers = { 10, 20, 30, 40, 50 };

		for (int x : numbers) {
			if (x == 20) {
				continue;
			}
			System.out.print(x);
			System.out.println("\n");

		}
	}
}
