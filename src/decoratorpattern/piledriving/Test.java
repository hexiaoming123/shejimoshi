package decoratorpattern.piledriving;

public class Test {

	public static void main(String[] args) {
		Work work = new SquarePeg();
		Work decorator = new Decorator(work);
		decorator.insert();
	}
}
