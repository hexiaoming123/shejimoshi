package strategypattern.shoppingcat1;
/**
 * 
* @ClassName: Book 业务逻辑放在具体子类
* @Description: TODO(各子类实现销售价格方法) 
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
	public abstract double getSalePrice();
	
}
