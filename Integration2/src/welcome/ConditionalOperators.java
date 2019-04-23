package welcome;

/*
 * Leemarie Collet
 */
import java.io.InputStream;
import java.util.Scanner;

public class ConditionalOperators {

	public static void main(String[] args) {

		InputStream stream = System.in;
		Scanner scan = new Scanner(stream);

		int age = 0;
		System.out.println("How old are you?");
		String Input = scan.next();
		System.out.println(age > 50 ? "You are old" : "You are young");
		scan.close();

	}
}
