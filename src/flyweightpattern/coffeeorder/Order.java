package flyweightpattern.coffeeorder;
/**订单抽象类*/
public abstract class Order {
	 	//执行卖出动作
	public abstract void sell();
	//获取咖啡味道
	public abstract String getFlavor();
}
