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

		int[] array = new int[10];
		Scanner in = new Scanner(System.in);
		int i = 0, value = 0, sum = 0;

		while (i < 10) {
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

		// int sum = (array.length / 2) * (array.length + 1);

		Random rand = new Random();

		/*
		 * for (int i = 0; i < array.length; i++)
		 * {
		 * int randomIndexToSwap = rand.nextInt(array.length);
		 * int temp = array[randomIndexToSwap];
		 * array[randomIndexToSwap] = array[i];
		 * array[i] = temp;
		 * 
		 * }
		 */

		int randomIndex = rand.nextInt(10);

		array[randomIndex] = 0;

		System.out.println(Arrays.toString(array));

		System.out.println("The missing number is : " + (sum - Arrays.stream(array).sum()));

	}

}
