package factorypattern;

public class PlantB implements Plant{

	public PlantB() {
		System.out.println(" creater PlantB!");
	}

	@Override
	public void doSomething() {
		System.out.println(" PlantB doSomething!");		
	}

}
