package decoratorpattern.piledriving;

public class SquarePeg implements Work {

	@Override
	public void insert() {
		System.out.println("方形桩插入");
	}

}
