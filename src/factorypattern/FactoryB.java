package factorypattern;

public class FactoryB implements AbstractFactory {

	@Override
	public Plant createPlant() {
		return new PlantB();
	}

	@Override
	public Fruit createFruit() {
		return new FruitB();
	}

}
