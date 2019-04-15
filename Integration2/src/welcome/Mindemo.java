package welcome;

import java.util.Arrays;

public class Mindemo {

	public static void main (String args[]){
		
		int numbers[]= {1,5,-50,12,-3,90, 18,27,4,-6};
		
		 //Find minimum (lowest) value in array by sorting array
		   System.out.println("Minimum Value = " + minValue(numbers));
		   //Find maximum (largest) value in array by sorting array
		   System.out.println("Maximum Value = " + maxValue(numbers));}
		
		 //Find minimum (lowest) value in array using array sort
			public static int minValue(int[] numbers){
			  Arrays.sort(numbers);
			  return numbers[0];
			}

			//Find maximum (largest) value in array using array sort
			public static int maxValue(int[] numbers){
			  Arrays.sort(numbers);
			  return numbers[numbers.length-1];
			}
	}
	   
	   