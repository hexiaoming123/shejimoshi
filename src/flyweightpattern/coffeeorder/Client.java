package flyweightpattern.coffeeorder;

import java.util.ArrayList;
import java.util.List;

/**客户类 带有main方法的测试类*/
public class Client {
	//客户下的订单
	private static List<Order> orders = new ArrayList<Order>(100);
	//订单对象生成工厂
	private static FlavorFactory flavorfactory;
	//增加订单
	private static void takeOrders(String flavor){
		orders.add(flavorfactory.getOrder(flavor));
	}
	public static void main(String[] args) {
		//订单生成工厂
		flavorfactory =flavorfactory.getInstance();
		//增加订单
		takeOrders("拿铁");
		takeOrders("欧蕾");
		takeOrders("卡布奇诺");
		takeOrders("夏威夷");
		takeOrders("维也纳");
		takeOrders("卡布奇诺");
		takeOrders("夏威夷");
		takeOrders("白咖啡");
		takeOrders("摩卡");
		takeOrders("香草星冰乐");
		takeOrders("拿铁");
		takeOrders("欧蕾");
		takeOrders("香草星冰乐");
		//卖咖啡
		for (Order order : orders) {
			order.sell();
		}
		//打印生成的订单java对象数量
		System.out.println(" \n客户一共买了"+orders.size()+"杯咖啡！");
		//打印生成的订单java对象数量
		System.out.println(" \n共生成了"+ flavorfactory.getTotalFlavorsMade()+"个FlavorFactory对象。");
	}
}
