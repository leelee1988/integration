package welcome;

/*
 * Leemarie Collet
 */
public class Enhanced {

	public static void main(String[] args) {
		int[] numbers = { 25, 30, 55, 46, 30 };

		for (int x : numbers) {
			System.out.print(x);
			System.out.print(",");
		}
		System.out.print("\n");
		String[] names = { "James", "Larry", "Tom", "Lacy" };

		for (String name : names) {
			System.out.print(name);
			System.out.print(",");
		}
	}

}
