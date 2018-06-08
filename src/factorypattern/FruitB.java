package factorypattern;

public class FruitB implements Fruit{

	public FruitB() {
		System.out.println(" creater FruitB!");
	}

	@Override
	public void doSomething() {
		System.out.println(" FruitB doSomething!");		
	}

}
