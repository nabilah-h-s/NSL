# Prototype Pattern
The Prototype pattern is generally used when we have an instance of the class (prototype) and we'd like to create new objects by just copying the prototype. One of the ways we can implement this pattern in Java is by using the clone() method. To do this, we'd implement the Cloneable interface. When we're trying to clone, we should decide between making a shallow or a deep copy.  

## Advantage and Disadvantage :

This pattern is handy when our new object is only slightly different from our existing one. In some cases, instances may have only a few combinations of state in a class. So instead of creating new instances, we may create the instances with the appropriate state beforehand and then clone them whenever we want.

Sometimes, we might encounter subclasses that differ only in their state. We can eliminate those subclasses by creating prototypes with the initial state and then cloning them.

Prototype pattern, just like every other design pattern, should be used only when it's appropriate. Since we are cloning the objects, the process could get complex when there are many classes, thereby resulting in a mess. Additionally, it's difficult to clone classes that have circular references.

The following example can illustrate how Prototype pattern works.

Here, we have -
- **Book** class 
- **Shop** class which contains a list of Book type and implements **Cloneable** class to override the **clone()** method.  
Cloneable is basically a **Marker Interface**. A Marker Interface is an interface that has no methods or constants inside it. It provides run-time type information about objects, so the compiler and JVM have additional information about the object.

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

## References :
- [Prototype Pattern in Java](https://www.baeldung.com/java-pattern-prototype)
- [Prototype Pattern in Java (JournalDev)](https://www.journaldev.com/1440/prototype-design-pattern-in-java)
- [Java clone – deep and shallow copy ](https://howtodoinjava.com/java/cloning/a-guide-to-object-cloning-in-java/)
- [Marker Interfaces in Java](https://www.baeldung.com/java-marker-interfaces)