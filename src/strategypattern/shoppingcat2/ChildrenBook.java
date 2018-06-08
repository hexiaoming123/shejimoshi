package strategypattern.shoppingcat2;

public class ChildrenBook extends Book {

	
	public ChildrenBook(String name , double price) {
		this.setName(name);
		this.setPrice(price);
	}

	/*@Override
	public double getSalePrice() {
		
		return this.getPrice() - 1;
	}*/

}
