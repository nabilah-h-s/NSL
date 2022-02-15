package prototypePattern;

import java.util.ArrayList;
import java.util.List;

public class Shop implements Cloneable{
	private String shopName;
	List <Book> books = new ArrayList();
	public String getShopName() {
		return shopName;
	}
	public void setShopName(String shopName) {
		this.shopName = shopName;
	}
	public List<Book> getBooks() {
		return books;
	}
	public void setBooks(List<Book> books) {
		this.books = books;
	}
	public void loadBooks() {
		for(int iterator = 0; iterator < 10; iterator++) {
			Book book = new Book();
			book.setBookId(iterator);
			book.setBookName("Book "+iterator);
			getBooks().add(book);
		}
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		Shop shopForCloning = new Shop();
		for (Book bookForCloning : this.getBooks()) {
			shopForCloning.getBooks().add(bookForCloning);
		}
		return shopForCloning;
	}
	@Override
	public String toString() {
		return "Shop [shopName=" + shopName + ", books=" + books + "]";
	}
	

}
