package builderpattern.house;

public class Test {
	public static void main(String[] args) {
		ConcreteHouseBuilderA myHouseBuilder = new ConcreteHouseBuilderA();
		House myHouse = HouseDirector.CreaterHouse(myHouseBuilder);
		System.out.println("my house has room:"+myHouse.getRoomNumber());
		System.out.println("my house has door:"+myHouse.getDoorNumber());
	}
}
