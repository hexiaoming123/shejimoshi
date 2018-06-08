package proxy;

/**
 * 
*类描述 客户端调用（我要通过秘书给局长传话）
*@author: Administrator
*@date: 日期:2018年5月25日 时间:上午11:46:49
*@version 1.0
 */
public class Client2 {
	
	public static void main(String[] args)  {
		//我直接去找秘书
		Subject2 sub = new ProxySubject2();
		sub.request();
	}
}
 