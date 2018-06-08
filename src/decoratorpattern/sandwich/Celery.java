package decoratorpattern.sandwich;
/**具体芹菜类--具体装饰类*/
public class Celery extends Decorator{



	public Celery(Igredient igredient) {
		super(igredient);
	}

	@Override
	public double getCost() {
		double basePrice = igredient.getCost();
		double celeryPrice = 0.8;
		return basePrice+celeryPrice;
	}

	@Override
	public String getDescription() {
		String base = igredient.getDescription();
		return base +"\n" +"Descrocated with Celery!";
	}
}
