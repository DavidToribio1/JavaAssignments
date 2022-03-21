import java.util.ArrayList;
import java.util.Scanner;

public class Demo {

		static ArrayList<Book> books = new ArrayList<Book>();
		
		//Declare a static ArrayList of Book objects
		
		public static void main(String[] args) {
			
			
			Scanner input = new Scanner(System.in);
		
			String title;
			String author;
			int isbn;
			double price;
			boolean isBorrowed;
			
			String choice;
			
			
			//Scanner object to take user input
			
			//declare variables needed to store user input information
			
			while(true) { //A forever loop. You can also use for(;;)
				
				System.out.println("Do want to enter book title (or 'done' to exit):");
				choice = input.nextLine();
				if(choice.equals("done")) {
					break;
				}
				System.out.println("Enter title of book");
				title = input.nextLine();
				System.out.println("What is the name of the Author");
				author = input.nextLine();
				System.out.println("Enter Book isbn");
				isbn = input.nextInt();
				System.out.println("Enter Book price");
				price = input.nextDouble();
				System.out.println("Is book borrowed");
				isBorrowed = input.nextBoolean();
				
				input.nextLine();
				
				
				books.add(new Book(title, author, isbn, price, isBorrowed));
			
			
				//get user input for title
				//check if title is equal to "done" {
					//if it is, break; the forever loop
				//}
				//get book's author, isbn, rental price, is borrowed values as shown in output example
				//add an extra .nextLine() after .nextBoolean()
				
				//add book object into ArrayList as shown:
				//books.add(new Book(title, author, isbn, price, isBorrowed));
			
				
			}
			
			System.out.println("----");
			System.out.println("The books you entered are:");
			
			
			for(Book book : books) {
				
				System.out.println(book);
			}
			
			System.out.println("Book Title and isbn number");
			for(Book book1 : books) {
				
				System.out.println(book1.getTitle() + ":" + book1.getIsbn());
			}
		
			/*
			 * Iterate through the ArrayList using one of the ways shown during class.. 
			 * or use any resource for reference. This assignment is open book
			 */
				//print each object inside the ArrayList
			
		}

	}
