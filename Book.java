package Book;

public class Book {
	String Book_title;
	int price;
	public String getBook_title() {
		return Book_title;
	}
	public void setBook_title(String book_title) {
		Book_title = book_title;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	
	public Book(String book_title, int price) {
		Book_title = book_title;
		this.price = price;
	}
	public Book() {
		
		Book_title = null;
	     price = 0;
	}
	
	
}
