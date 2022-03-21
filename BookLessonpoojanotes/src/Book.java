/*UML Diagram attached
Requirement for constructors:
Some books might have just the title , numberOfPages & isbn
Some books title, numberOfPages, isbn, author , publisher
and some books will have all values 
 */

public class Book {

	String title;
	String publisher;
	int numOfPages;
	long isbn;
	int edition;
	String author = "UNKNOWN";

//constructor title pages isbn
	Book(String title, int pages, long isbn) {
		this.title = title;
		this.numOfPages = pages;
		this.isbn = isbn;

	}

	// constructor title,pages, long, publisher, author
	Book(String title, int numOfPages, long isbn, String publisher, String author) {
		this.title = title;
		this.numOfPages = numOfPages;
		this.isbn = isbn;
		this.publisher = publisher;

	}

	// constructor
	Book(String title, int numOfPages, long isbn, String publisher, String author, int edition) {
		this.title = title;
		this.numOfPages = numOfPages;
		this.isbn = isbn;
		this.publisher = publisher;
		this.edition = edition;
		this.author = author;
	}

	// instance method
	void readEachPage() {
		for (int i = 1; i <= this.numOfPages; i++)
			System.out.println("Reading page" + i + "complete");
		
	}

	// instance method
	boolean sameAuthor(Book book) {
		return this.author.equals(book.author);
	}

	// instance method
	boolean islsbnValid() {
		return this.isbn != 0;
	}
	
	@Override
	public String toString() {

		return ("title is " + this.title + ". Publisher is " + this.publisher + " author is " + this.author + " .isbn is " + this.isbn + ".Number of pages is " + this.numOfPages + " .edition is " + this.edition);
		
	}
}
