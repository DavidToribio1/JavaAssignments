import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Book[] newBooks = new Book[5];
		
		Scanner input = new Scanner(System.in);
		
		String title;
		int pages;
		long isbn;
		String publisher;
		String author;
		int edition;
		
		String choice;
		Book book;
		
		//title pages isbn
		//title,pages, isbn, publisher, author
		//String title, int numOfPages, long isbn, String publisher, String author, int edition
		for(int j = 0; j <= newBooks.length - 1; j++) {
			
			System.out.println("Enter the title of Book " + j);
			title = input.nextLine();
			
			System.out.println("Enter the number of pages in the book ");
			pages = input.nextInt();
			
			System.out.println("Enter the isbn for the book");
			isbn = input.nextLong();
			
			input.nextLine();
			
			System.out.println("Do you know the author & publisher of this book?");
			choice = input.nextLine();
			
			
			if(choice.equals("yes")) {
				
				System.out.println("Enter the author");
				author = input.nextLine();
				
				System.out.println("Enter the publisher");
				publisher = input.nextLine();
				
				System.out.println("Do you know the edition of this book?");
				choice = input.nextLine();
				
				if(choice.equals("yes")) {
					System.out.println("Enter the edition of the book");
					edition = input.nextInt();
					
					book = new Book(title, pages, isbn, publisher, author, edition);
				}
				
				else {
					book = new Book(title, pages, isbn, publisher, author);
				}
			}
			
			else {
				
				book = new Book(title, pages, isbn);
			}
			
			newBooks[j] = book;
			
			System.out.println("Thank you! The book was stored in the array");
			
		}
		
		System.out.println("Printing the details of each book that you entered");
		
		for(int i = 0 ; i <= newBooks.length - 1; i++) {
			
			System.out.println(newBooks[i]);
		}
		
		//name, String location, String manager, Book[] books
		Library library = new Library("DCI Resources", "CT", "Kevin Conlan", newBooks);
		
	}

}
