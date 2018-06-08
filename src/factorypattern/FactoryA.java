package factorypattern;

public class FactoryA implements AbstractFactory {

	@Override
	public Plant createPlant() {
		return new PlantA();
	}

	@Override
	public Fruit createFruit() {
		return new FruitA();
	}

}
