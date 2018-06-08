package decoratorpattern.sandwich;
/**面包抽象类---装饰抽象类*/
public abstract class Decorator extends Igredient{

	Igredient igredient;
	
	public Decorator(Igredient igredient) {
		this.igredient = igredient;
	}

	@Override
	public abstract double getCost() ;

	@Override
	public abstract String getDescription() ;

	
}
