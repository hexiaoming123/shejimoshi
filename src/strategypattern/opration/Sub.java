package strategypattern.opration;
/**具体策略角色*/
public class Sub implements Opration {

	@Override
	public void op(double a, double b) {

		double result = a - b;
		System.out.println(result);
	}

}
