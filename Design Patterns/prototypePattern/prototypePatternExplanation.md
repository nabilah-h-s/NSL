```java
package prototypePattern;

public class Book {
	private int bookId;
	private String bookName;
	
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	
	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", bookName=" + bookName + "]";
	}
	
	

}
```
```java
package prototypePattern;

public class PrototypePattern {

	public static void main(String[] args) throws CloneNotSupportedException {

		// let, this this fetching data from database
		Shop firstShop = new Shop();
		firstShop.setShopName("First Store");
		firstShop.loadBooks();

		// cloning data from first shop
		Shop secondShop = (Shop) firstShop.clone();
		secondShop.setShopName("Cloned Shop");

		// updating shop books
		firstShop.getBooks().remove(1);
		secondShop.getBooks().add(new Book());

		// displaying book details
		System.out.println(firstShop);
		System.out.println(secondShop);

	}

}

```
```java
package prototypePattern;

import java.util.ArrayList;
import java.util.List;

public class Shop implements Cloneable {
	private String shopName;
	List<Book> books = new ArrayList();

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
		for (int iterator = 0; iterator < 10; iterator++) {
			Book book = new Book();
			book.setBookId(iterator);
			book.setBookName("Book " + iterator);
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

```