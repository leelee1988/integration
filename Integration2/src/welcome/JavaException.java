package welcome;

import java.util.InputMismatchException;
import java.util.Scanner;

public class JavaException {

	public static void main(String[] args) {

		try {
			int a[] = new int[2];
			System.out.println(a[5]);
		} catch (Exception e) {
			System.out.println("An error has occured");
		}
	}
}