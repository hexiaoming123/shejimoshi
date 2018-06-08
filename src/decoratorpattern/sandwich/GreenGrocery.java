package decoratorpattern.sandwich;
/**具体青菜类--具体装饰类*/
public class GreenGrocery extends Decorator{



	public GreenGrocery(Igredient igredient) {
		super(igredient);
	}

	@Override
	public double getCost() {
		double basePrice = igredient.getCost();
		double greenGroceryPrice = 0.4;
		return basePrice+greenGroceryPrice;
	}

	@Override
	public String getDescription() {
		String base = igredient.getDescription();
		return base +"\n" +"Descrocated with GreenGrocery!";
	}
}
