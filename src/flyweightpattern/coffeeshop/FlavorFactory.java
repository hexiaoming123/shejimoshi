package flyweightpattern.coffeeshop;

public class FlavorFactory {
	private Order[] flavors = new Flavor[10];
	private int ordersMade = 0;//已经处理好的订单
	private int totalFlavors = 0;//已购买的coffee风味种类数
	
	public Order getOrder(String flavorToGet){
		if (ordersMade > 0) {
			for (int i = 0; i < ordersMade; i++) {
				if (flavorToGet.equalsIgnoreCase(flavors[i].getFlavor()))
					return flavors[i];
			}
		}
		flavors [ordersMade] = new Flavor(flavorToGet);
		totalFlavors++;
		return flavors[ordersMade++];
	}
	
	public Order[] getFlavors() {
		return flavors;
	}
	public void setFlavors(Order[] flavors) {
		this.flavors = flavors;
	}
	public int getOrdersMade() {
		return ordersMade;
	}
	public void setOrdersMade(int ordersMade) {
		this.ordersMade = ordersMade;
	}
	public int getTotalFlavors() {
		return totalFlavors;
	}
	public void setTotalFlavors(int totalFlavors) {
		this.totalFlavors = totalFlavors;
	}
	
}
