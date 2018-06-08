package strategypattern.shoppingcat1;

public class CsBook extends Book {

	public CsBook(String name , double price){
		this.setName(name);
		this.setPrice(price);
	}
	@Override
	public double getSalePrice() {
		
		return this.getPrice() * 0.91;
	}

}
