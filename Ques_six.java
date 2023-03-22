import java.util.Arrays;
import java.util.Random;
import java.util.HashMap;
import java.util.Scanner;

public class Ques_six {

	public static void main(String[] args) {
		// HashMap<Integer, Integer> hash_map = new HashMap<>();
		// int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		/*
		 * Define a class which has a main method,
		 * It creates an integer array of 10 elements
		 * and initializes it by values from 1 to 10.
		 * Replace a random element value by 0. Your method should identify
		 * and display the missing element ( which is replaced by zero).
		 */

		int[] array = new int[10];// array of size 10 initializes
		Scanner in = new Scanner(System.in);
		int i = 0, value = 0, sum = 0;

		while (i < 10) {// User Enter values from 1 - 10 
			System.out.println("Enter Values between 1 - 10");
			value = in.nextInt();
			if (value < 1 || value > 10)

				System.out.println("Invalid Enter Values Between 1 - 10");

			else {
				array[i] = value;
				i += 1;
				sum += value;
			}
		}

		

		Random rand = new Random();

		

		int randomIndex = rand.nextInt(10); // Random index is created and 0 is inserted in random index

		array[randomIndex] = 0;

		System.out.println(Arrays.toString(array));// array is displayed with missing number 

		System.out.println("The missing number is : " + (sum - Arrays.stream(array).sum()));// missing number is displayed

	}

}
