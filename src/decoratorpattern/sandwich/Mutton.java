package decoratorpattern.sandwich;
/**具体羊肉类--具体装饰类*/
public class Mutton extends Decorator {

	public Mutton(Igredient igredient) {
		super(igredient);
	}

	@Override
	public double getCost() {
		double basePrice = igredient.getCost();
		double muttonPrice = 2.3;
		return basePrice+muttonPrice;
	}

	@Override
	public String getDescription() {
		String base = igredient.getDescription();
		return base +"\n" +"Descrocated with Mutton!";
	}

}
