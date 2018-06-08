package strategypattern.shoppingcat2;
/**
 * 
* @ClassName: Book 把打折策略代码提到父类来实现
* @Description: TODO(父类实现销售价格方法) 
* @author A18ccms a18ccms_gmail_com 
* @date 2018年6月5日 上午10:22:41 
*
 */
public abstract class Book {
	
	private double price;
	private String name;
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
//	public abstract double getSalePrice();
	public static double toSalePrice(Book book){
		if (book instanceof ChildrenBook) {
			return book.getPrice() - 1;
		} else if(book instanceof CsBook){
			return book.getPrice() * 0.91;
		}
		return 0 ;
	}
}
