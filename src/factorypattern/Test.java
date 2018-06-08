package factorypattern;

public class Test {
	public static void main(String[] args) {
		AbstractFactory a = new FactoryA();
		Fruit A =a.createFruit();
		A.doSomething();
		AbstractFactory B = new FactoryB();
		Fruit b =B.createFruit();
		b.doSomething();
	}
}
