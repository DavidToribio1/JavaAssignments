import java.util.Scanner;

/*
 * Name:David
 * Date: 3/6/2022
 * Description: Arrays Assingment from prevuous batch
 */
public class Arrays {
	
	public static void main (String [] args) {
	 
	int[] alpha = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
	
	
	System.out.println(alpha[10]);
	
	 alpha [5] = 35;
	 
	 System.out.println(alpha[5]);
	 
	 alpha[9] = alpha[6] + alpha[13];
	 
	 System.out.println(alpha[9]);
	
	
	

	String[] weekdays = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};

	System.out.println(weekdays[1]);
		
			for(int i = 0; i<weekdays.length; i++) {
				
				System.out.println(weekdays[i]);
	
			}

			   Scanner sc=new Scanner(System.in);

			      int n;    //Declare array size
			      System.out.println("Enter the total number of elements ");
			      n=sc.nextInt();     //Initialize array size

			      int arr[]=new int[n];   //Declare the array
			      System.out.println("Enter the elements of the array ");
			      for(int i=0; i<n ;i++)     //Initialize the array
			      {
			          arr[i]=sc.nextInt();
			      }
			      int sum = 0;       //Variable to calculate the total sum
			      //Using For each loop
			      for( int num : arr) 
			      {
			          sum = sum+num;     //Increment the value of sum in each iteration
			      }
			       
			       //Print the total sum
			        System.out.println("The sum of all the elements in the array is "+sum);
			        
			   }
			
		
		
		
}

