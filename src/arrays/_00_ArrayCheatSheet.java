package arrays;

import java.util.Random;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		//1. make an array of 5 Strings
		String[] x = new String[5];
		//2. print the third element in the array
		System.out.println(x[2]);
		
		//3. set the third element to a different value
		x[2] = "3";
		x[1] = "2";
		x[0] = "1";
		x[3] = "4";
		x[4] = "5";
		//4. print the third element again
		System.out.println(x[2]);
		//5. use a for loop to print all the values in the array
		//   BE SURE TO USE THE ARRAY'S length VARIABLE
		for (int i = 0; i < 5; i++) {
			System.out.println(x[i]);
		}
		System.out.println();
		
		//6. make an array of 50 integers
		int[] y = new int[50];
		//7. use a for loop to make every value of the integer array a random number
		Random r = new Random();
		for (int i = 0; i < 50; i++) {
			y[i] = r.nextInt(50);
		}
		//8. without printing the entire array, print only the smallest number in the array
		int smallestNum = y[0];
		for (int i = 1; i < y.length; i++) {
			if(y[i]<smallestNum) {
				smallestNum = y[i];
		}
	}
		System.out.println(smallestNum);
		System.out.println();
		//9 print the entire array to see if step 8 was correct
		for (int j = 0; j < y.length; j++) {
		System.out.println(y[j]);
		}
		//10. print the largest number in the array.
		int largestNum = y[0];
		for (int i = 0; i < 50; i++) {
			if(y[i]>largestNum) {
				largestNum = y[i];
			}
		}
		System.out.println();
		System.out.println(largestNum);
	}
}
