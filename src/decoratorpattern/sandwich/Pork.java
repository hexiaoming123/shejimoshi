package decoratorpattern.sandwich;
/**具体猪肉类--具体装饰类*/
public class Pork extends Decorator {

	public Pork(Igredient igredient) {
		super(igredient);
	}

	@Override
	public double getCost() {
		double basePrice = igredient.getCost();
		double porkPrice = 1.8;
		return basePrice+porkPrice;
	}

	@Override
	public String getDescription() {
		String base = igredient.getDescription();
		return base +"\n" +"Descrocated with Pork!";
	}

}
