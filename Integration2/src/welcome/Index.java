package welcome;

import java.util.Arrays;

/*
 * Leemarie Collet
 */
public class Index {

	// Function to find the index of an element
	public static int findIndex(int arr[], int t) {

		int index = Arrays.binarySearch(arr, t);
		return (index < 0) ? -1 : index;
	}

	// Driver Code
	public static void main(String[] args) {
		int[] my_array = { 2, 4, 6, 8, 10, 12, 14 };

		// find the index of 5
		System.out.println("Index position of 6 is: " + findIndex(my_array, 6));

		// find the index of 7
		System.out.println("Index position of 14 is: " + findIndex(my_array, 14));
	}
}
