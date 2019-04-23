package welcome;

import java.util.Scanner;

/**
 * Leemarie Collet Final class ~ means that you cannot edit the value of that
 * variable. It's typically used for constants such as PI or whatnot. Variable ~
 * are essentially containers which allow a program to store different pieces of
 * information inside of them.
 **/
public final class Variables {

	public static void main(String[] args) {

		String phrase = "Hi i am Lee and a little about me is:";
		Scanner scan = new Scanner(System.in);

		char grade = 'B';
		int age = 20;
		double gpa = 2.9;
		boolean isFemale = true;

		System.out.println(phrase);
		System.out.println("On average I usually get a " + grade);
		System.out.println("I am currently " + age + " years old. ");
		System.out.println("My current gpa is " + gpa);
		System.out.println("True or false: Am I a female? " + isFemale);

		scan.close();
	}

}
