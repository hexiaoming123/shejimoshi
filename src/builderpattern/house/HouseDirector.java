package builderpattern.house;
/**房屋构建的表示者*/
public class HouseDirector {

	public static House CreaterHouse(HouseBuilder concreteBuilder){
		
		concreteBuilder.BuidRoom(1);
		concreteBuilder.BuidRoom(2);
		concreteBuilder.BuidDoor(1, 2);
		concreteBuilder.BuidDoor(2, 1);
		return concreteBuilder.getHouse();
	}
}
