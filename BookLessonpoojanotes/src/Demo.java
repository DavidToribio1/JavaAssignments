
public class Demo {
	
	public static void main(String[] args) {
		
		Book[] userBooks = new Book[5]; 
		
		userBooks[0] = new Book("XYZ", 50, 40920303);
		
		userBooks[1] = new Book("ABC", 2, 0);
		
		userBooks[2] = new Book("WQE", 19, 453534, "Penguin Publishers", "Kevin C");
		
		userBooks[3] = new Book("RET", 15, 595059585, "Walter Publishers", "Mark R");
		
		userBooks[4] = new Book("POO", 28, 0, "DCI UST", "Derrick", 4);
		
		
		//System.out.println(userBooks[0]);
		
		
		Library library = new Library("DCI Resources", "CT", "Kevin Conlan", userBooks);
		library.printAllBooksDetails();
		
		
		
		
		
	}

}
