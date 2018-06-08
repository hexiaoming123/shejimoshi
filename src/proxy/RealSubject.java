package proxy;
/**
 * 
*类描述：真实角色
*@author: Administrator
*@date: 日期:2018年5月24日 时间:下午4:10:52
*@version 1.0
 */
public class RealSubject implements Subject {

	@Override
	public void request() {
		System.out.println("From real subject");
	}
}
