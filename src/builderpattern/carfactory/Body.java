package builderpattern.carfactory;
/**
 * 
*类描述：车身类
*@author: Administrator
*@date: 日期:2018年5月26日 时间:下午5:41:29
*@version 1.0
 */
public class Body {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public Body(String name) {
		this.name = name;
	}

	
	
}
