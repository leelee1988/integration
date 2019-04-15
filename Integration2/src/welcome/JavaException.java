package welcome;

import java.util.InputMismatchException;
import java.util.Scanner;

public class JavaException {

	public static void main(String[] args) {
		int n;
		Scanner in = new Scanner(System.in);
		System.out.println("Ebter a whole integar: ");
		
		if(!in.hasNext())
			throw new InputMismatchException();
		
		n = in.nextInt();
		System.out.println("n is " + n + ",done ");
		
	}		
}