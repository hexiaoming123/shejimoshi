package builderpattern.house;
/**房屋构建者实现类*/
public class ConcreteHouseBuilderB implements HouseBuilder {

		private House house;

	public ConcreteHouseBuilderB() {
		house = new House();
	}
	
		@Override
	public void BuidRoom(int roomNo) {
		house.roomNumber = house.roomNumber +roomNo;
	}

	@Override
	public void BuidDoor(int room1, int room2) {
		house.doorNumber = house.doorNumber +room1+room2+999;
	}

	@Override
	public House getHouse() {
		return house;
	}
}
