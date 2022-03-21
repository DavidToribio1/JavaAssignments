
public class Book {
	
	private String title;
	private String author;
	private int isbn;
	private double price;
	private boolean isBorrowed;
	
	public Book(String title, String author, int isbn, double price, boolean isBorrowed) {
		super();
		this.title = title;
		this.author = author;
		this.isbn = isbn;
		this.price = price;
		this.isBorrowed = isBorrowed;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getIsbn() {
		return isbn;
	}

	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public boolean isBorrowed() {
		return isBorrowed;
	}

	public void setBorrowed(boolean isBorrowed) {
		this.isBorrowed = isBorrowed;
	}

	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + ", isbn=" + isbn + ", price=" + price + ", isBorrowed="
				+ isBorrowed + "]";
	}
	
	
	
	

}
