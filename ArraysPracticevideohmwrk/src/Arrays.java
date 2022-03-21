/*
 * Author: David Toribio
 * Date:2/24/2022
 * Info: Creating Array 
 * 
 * 	1.Create an integer array of 5 elements with random values of your choice
	2.Print the length of the array
	3.Create a static method that takes this array as parameter and prints the largest number in the array
	4.Create a static method that takes this array as parameter and prints the array in reverse order
	5.Create a static method that prints the sum of all elements in the array
 */

public class Arrays {

	public static void main(String[] args) {

		// creating array

		int[] nums = { 10, 20, 30, 40, 50 };

		int arrayLength = nums.length; // array length attribute
		System.out.println("The length of the array is: " + arrayLength);

		System.out.println("Largest in given array is " + getLargestArray(nums));

		// printing numbers in array

		System.out.println("Printing the numbers in Array");
		for (int i = 0; i <= (nums.length - 1); i++) {

			System.out.println(nums[i]);
		}
		
		//print reverse array

		System.out.println("The Array in reverse");

		reverse(nums);
		
		// print sum of array

		System.out.println("Sum of given array is " + sum(nums));

	}

	static int getLargestArray(int[] nums) {

		int i;

		// Initialize max element
		int max = nums[0];

		 
		// compare every element with current max
		for (i = 1; i < nums.length; i++)
			if (nums[i] > max)
				max = nums[i];

		return max;
	}

	public static void reverse(int[] nums) {
		//iterate through array set array to reverse print the reverse array

		for (int i = nums.length - 1; i >= 0; i--) {

			System.out.println(nums[i]);

		}
	}

	static int sum(int[] nums)

	{
		int sum = 0; // initialize sum
		int i;

		// Iterate through all elements and add them to sum
		for (i = 0; i < nums.length; i++)
			sum += nums[i];

		return sum;
	}

}