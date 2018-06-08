package proxy;
/**
 * 
*类描述：代理模式 
*抽象角色：ISubject：抽象主题角色，是一个接口。该接口是对象和它的代理共用的接口。
*代理角色：Proxy：代理角色，内部含有对真实对象RealSubject的引用，从而可以操作真实对象。
*		代理对象提供与真实对象相同的接口，以便在任何时刻都能代替真实对象。
*		同时，代理对象可以在执行真实对象操作时，附加其他的操作，相当于对真实对象进行封装。
*真实角色：RealSubject：真实主题角色，是实现抽象主题接口的类。
*@author: Administrator
*@date: 日期:2018年5月24日 时间:下午3:46:26
*@version 1.0
 */
public class ProxMain {
	public static void main(String[] args) {
		//测试1
		Subject sub = new ProxySubject();
		sub.request();
		System.out.println("--------------------------------");
		//测试2
		MyForum forum =new MyForumProxy(1);
		forum.AddFile();
	}
	
}
