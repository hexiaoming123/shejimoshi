package builderpattern.house;
/**
 * 
*类描述：房屋构建者的接口
*@author: Administrator
*@date: 日期:2018年5月26日 时间:下午3:01:54
*@version 1.0
 */
public interface HouseBuilder {
	public void BuidRoom(int roomNo);
	public void BuidDoor(int room1,int room2);
	public House getHouse();
}
