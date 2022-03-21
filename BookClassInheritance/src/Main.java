
public class Main {

	public static void main(String[] args) {
		
		Book java = new Book(1234567, "Intro to Java");
		Book csharp = new Book(89765430, "Intro to C#", "Sushil" );
		
		PaperBook python = new PaperBook(2345689, "Intro to Python", "Tomas", 100, 2.5f);
		PaperBook nodejs = new PaperBook(456790, "Intro to Node.js", 500, 1.2f);
		
		EBook angular = new EBook(3398888, "Intro to Angular framework", "Justice", "angular.dci.com",10.0f);
		EBook react = new EBook(997393, "Intro to React Framework","react.dci.com", 25.5f);
		
		System.out.println(java.generateID());
		System.out.println(nodejs.generateID());
		System.out.println(angular.generateID());
	}

}
