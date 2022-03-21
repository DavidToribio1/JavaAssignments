import java.util.Scanner;

/*
 * Write a program to calculate a number to the power 3 using for loop
	Author: David Toribio
	Date: 2/15/2022
	
	
 */


import java.util.Scanner;

public class Powerof3 {
	public static void main(String[] args) {
		//create scanner class for input user
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your number");
		int num = input.nextInt();
		long result = 0;
		
		
		
		//for loop to iterate through number to print result
		for(int i = 0; i < num; i++) {
			//multiplying number by it self 3 times
			result = num * num * num ;
		}
		//printing answer
		System.out.println("The number " + num + " to the power of 3 is " + result);
	
		
		input.close();
	} 

}
