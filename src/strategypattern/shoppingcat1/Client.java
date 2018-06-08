package strategypattern.shoppingcat1;

public class Client {
	
	public static void main(String[] args) {
		
		Book csBook = new CsBook("Think in java", 89);
		Book childrenBook = new ChildrenBook("高性能MySQL", 79);
		System.out.println(csBook.getName()+":"+csBook.getSalePrice());
		System.out.println(childrenBook.getName()+":"+childrenBook.getSalePrice());
	}
}
