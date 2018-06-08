package flyweightpattern.flyweight;
/**
 * 
*类描述：将歌唱者的姓名作为共享的 ConcreteFlyweight
*@author: Administrator
*@date: 日期:2018年5月25日 时间:下午4:28:25
*@version 1.0
 */
public class Artist {
	//内部状态
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Artist() {}

	public Artist(String name) {
		this.name = name;
	}
	
}
