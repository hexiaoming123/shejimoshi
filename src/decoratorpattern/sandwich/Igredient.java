package decoratorpattern.sandwich;

import util.DoubleOperationUtil;

/**公共抽象类*/
public abstract class Igredient {

	public abstract double getCost();
	public abstract String getDescription();
	public void printDescription(){
		System.out.println("Name "+this.getDescription());
//		System.out.println("Price RMB "+this.getCost());
		double cost = DoubleOperationUtil.round(this.getCost(), 2);
		System.out.println("Price RMB "+cost);
	}
}
