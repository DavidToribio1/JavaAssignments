/*
 * Write a program that converts hourOfDay from 24-hour format to a 12-hour format
Sample output 1
	Author: David Toribio
	Date: 2/15/2022
 */

import java.util.Scanner;
public class ConvertTime {

	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your time to convert");
		int hourMilitary = input.nextInt();
		int hourCivilian = 0;
		String mean;
		
		hourCivilian = hourMilitary % 12;
		//Implement the Am/Pm
		if(hourMilitary >= 12 ) {
			mean = "PM";
		}
		else {
			mean = "AM";
		}
		
		//hourcivilian is converted from 0 adds 12 to that number that is entered
		if(hourCivilian < 0) {
			
			hourCivilian = hourCivilian + 12;
		}
		//making 0 into 12pm
		if(hourCivilian == 0) {
			hourCivilian =12;
		}
		
		System.out.println(" The " + hourMilitary + " in military time converts to " + hourCivilian + mean + " in civilian time");

		
		input.close();
	}
	
		
		
		
		
		
	
	

}
