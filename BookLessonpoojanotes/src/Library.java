
public class Library {
	
	String name;
	String location;
	String manager;
	//Assume library will have 10 books
	Book[] books = new Book[10];
	
	Library(String name, String location, String manager, Book[] books) {
		
		this.name = name;
		this.location = location;
		this.manager = manager;
		this.books = books;
	}
	
	/*
	 * It prints the details of each book in the library
	 * @params: None
	 * @return : void
	 */
	void printAllBooksDetails() {
		
		for(int i =0; i <= this.books.length - 1; i++) {
			
			System.out.println(this.books[i]);
		}
		
	}

}
