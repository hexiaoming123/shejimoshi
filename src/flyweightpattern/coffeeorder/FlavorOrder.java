package flyweightpattern.coffeeorder;
/**订单实现类*/
public class FlavorOrder extends Order {

	private String flavor;
	
	public FlavorOrder(String flavor) {
		this.flavor = flavor;
	}

	@Override
	public void sell() {
		System.out.println(" 卖出一杯[ "+flavor +"  ]。");		
	}

	@Override
	public String getFlavor() {
		return this.flavor;
	}

}
