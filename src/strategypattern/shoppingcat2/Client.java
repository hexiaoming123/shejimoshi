package strategypattern.shoppingcat2;

public class Client {
	
	public static void main(String[] args) {
		
		Book csBook = new CsBook("Think in java", 89);
		Book childrenBook = new ChildrenBook("高性能MySQL", 79);
		System.out.println(csBook.getName()+":"+Book.toSalePrice(csBook));
		System.out.println(childrenBook.getName()+":"+Book.toSalePrice(childrenBook));
	}
}
