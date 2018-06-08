package factorypattern;

public class FruitA implements Fruit{

	public FruitA() {
		System.out.println(" creater FruitA!");
	}

	@Override
	public void doSomething() {
		System.out.println(" FruitA doSomething!");		
	}

}
