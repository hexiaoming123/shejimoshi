package flyweightpattern.coffeeshop;

public class Client {

	private static Order[] flavors = new Flavor[13];
	private static int ordersMade = 0;
	private static FlavorFactory flavorFactory;
	private static void takeOrders(String aFlavor){
		flavors[ordersMade++] = flavorFactory.getOrder(aFlavor);
	}
	public static void main(String[] args) {
		flavorFactory = new FlavorFactory();
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
		for (int i = 0; i < ordersMade; i++) {
			flavors[i].serve(new Table(i));
		}
		System.out.println(" \nTotal Flavor objects made:"+flavorFactory.getTotalFlavors());
	}
	public Client() {
		super();
		// TODO Auto-generated constructor stub
	}
	public static Order[] getFlavors() {
		return flavors;
	}
	public static void setFlavors(Order[] flavors) {
		Client.flavors = flavors;
	}
	public static int getOrdersMade() {
		return ordersMade;
	}
	public static void setOrdersMade(int ordersMade) {
		Client.ordersMade = ordersMade;
	}
	public static FlavorFactory getFlavorFactory() {
		return flavorFactory;
	}
	public static void setFlavorFactory(FlavorFactory flavorFactory) {
		Client.flavorFactory = flavorFactory;
	}
	
}
