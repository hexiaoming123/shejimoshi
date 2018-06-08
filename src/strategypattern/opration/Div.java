package strategypattern.opration;
/**具体策略角色*/
public class Div implements Opration {

	@Override
	public void op(double a, double b) {
		if (b != 0) {
			double result = a / b;
			System.out.println(result);
		}else {
			System.out.println("a除零异常！");
		}
		
	}

}
