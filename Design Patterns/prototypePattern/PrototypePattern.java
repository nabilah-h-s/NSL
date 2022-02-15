package prototypePattern;

public class PrototypePattern {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		//let, this this fetching data from database
		Shop firstShop = new Shop();
		firstShop.setShopName("First Store");
		firstShop.loadBooks();
		
		//cloning data from first shop
		Shop secondShop = (Shop) firstShop.clone();
		secondShop.setShopName("Cloned Shop");
		
		
		//updating shop books
		firstShop.getBooks().remove(1);
		secondShop.getBooks().add(new Book());
		
		//displaying book details
		System.out.println(firstShop);
		System.out.println(secondShop);
		
		
	}

}
