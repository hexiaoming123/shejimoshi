package statespattern;
/**具体状态类*/
public class ConcreteStateA implements State {

	@Override
	public void handle(String sampleParameter) {
		System.out.println("ConcreteStateA handle："+sampleParameter);
	}

}
