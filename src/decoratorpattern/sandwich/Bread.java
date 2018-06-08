package decoratorpattern.sandwich;
/**具体面包类---被装饰类*/
public class Bread extends Igredient{

	private String description;
	
	public Bread(String description) {
		this.description = description;
	}

	@Override
	public double getCost() {
		return 2.48;
	}

	@Override
	public String getDescription() {
		return description;
	}

	
}
