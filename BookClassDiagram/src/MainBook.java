import java.util.Scanner;

public class MainBook {

	public static void main(String[] args) {
		
		Book book1 = new Book();
		
		Book book2 = new Book("Think n grow rich",300,12345);
		
		Book book3 = new Book("Power Of mind", 240, 12345,"real books", "bob proctor",1);
		
		System.out.println("First Book");
		
		System.out.println(book1.author);
		System.out.println(book1.title);
		System.out.println(book1.edition);
		System.out.println(book1.isbn);
		System.out.println(book1.publisher);
		System.out.println(book1.numberOfPages);
		
		System.out.println("Second Book");
		
		System.out.println(book2.author);
		System.out.println(book2.title);
		System.out.println(book2.edition);
		System.out.println(book2.isbn);
		System.out.println(book2.publisher);
		System.out.println(book2.numberOfPages);
		
		book1.readEachPage();
		
		book1.isbn = 10;
		
		System.out.println(book1.isbn);
		
		
		
		
	
		
		
	}

}
