/*
 * UML Diagram attached
Requirement for constructors:
Some books might have just the title , numberOfPages & isbn
Some books title, numberOfPages, isbn, author , publisher
and some books will have all values 
 * 
 */
public class Book {
	
	String title;
	String publisher;
	int numberOfPages;
	long isbn;
	int edition;
	String author = "Unknown";
	
	//Construtor
	
	Book(){
		this.title = "Book";
		this.publisher = "Jaico Publishing House";
		this.numberOfPages = 100;
		this.isbn = 300;
		this.edition = 1;
		this.author = "Unknown" ;
	}
	//title , numberOfPages & isbn
	Book(String titl, int pages, long bn){
		
		this.title= titl;
		this.numberOfPages = pages;
		this.isbn = bn;
		
	}
	//all values
	Book(String titl, int pages, long isbn2, String publisher2, String author2, int edition2){
		
		this.title = titl;
		this.numberOfPages = pages;
		this.isbn = isbn2;
		this.publisher = publisher2;
		this.author = author2;
		this.edition = edition2;
		
		
		
	}
//Some books title, numberOfPages, isbn, author , publisher
	Book(String titl,String pub, int pages, long bn , String aut){
		
		this.title = titl;
		this.publisher = pub;
		this.numberOfPages = pages;
		this.isbn = bn;
		this.author = aut;
	}
	
	
	void readEachPage() {
		
		
		
		//for loop that loops through each page of the book
		//this.numberOfPages;
		for(int i = 1; i<= this.numberOfPages; i++) {
			
			System.out.println("Reading Page Number " + i + " from the book " + this.title);
			
			
		}
		
		
	}
	
	boolean sameAuthor(Book book1) {
		
		return this.author.equals(book1.author);
		
	}
	
	boolean isIsbnvalid() {
		
		return this.isbn != 0;
		
	}
	

}
