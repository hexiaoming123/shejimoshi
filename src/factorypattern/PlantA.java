package factorypattern;

public class PlantA implements Plant{

	public PlantA() {
		System.out.println(" creater PlantA!");
	}

	@Override
	public void doSomething() {
		System.out.println(" PlantA doSomething!");		
	}

}
