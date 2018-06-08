package proxy;

import java.lang.reflect.Proxy;

/**
 * 代理模式的实用性：   1) 远程代理（Remote  Proxy）为一个位于不同的地址空间的对象提供一个本地的代理对象。这个不同的地址空间可以是在同一台主机中，也可是在另一台主机中，远程代理又叫做大使(Ambassador)
				2) 虚拟代理（Virtual Proxy）根据需要创建开销很大的对象。如果需要创建一个资源消耗较大的对象，先创建一个消耗相对较小的对象来表示，真实对象只在需要时才会被真正创建。 
				3) 保护代理（Protection Proxy）控制对原始对象的访问。保护代理用于对象应该有不同的访问权限的时候。
				4) 智能指引（Smart Reference）取代了简单的指针，它在访问对象时执行一些附加操作。
				5) Copy-on-Write代理：它是虚拟代理的一种，把复制（克隆）操作延迟到只有在客户端真正需要时才执行。一般来说，对象的深克隆是一个开销较大的操作，Copy-on-Write代理可以让这个操作延迟，只有对象被用到的时候才被克隆。
*类描述：测试类
*@author: Administrator
*@date: 日期:2018年5月25日 时间:上午9:41:13
*@version 1.0
 */
public class Test {
	/**
	 * logic1 和logic的共同逻辑
	 *@param proxy 代理
	 */
	private static void publicLogic(Object proxy){
		//对目标接口Target1代理的调用
		System.out.println(" 对目标接口Target1代理的调用");
		Target1 t1 = (Target1)proxy;
		t1.doSomething();
		System.out.println();
		//对目标接口Target2代理的调用
		System.out.println(" 对目标接口Target2代理的调用");
		Target2 t2 = (Target2)proxy;
		System.out.println(" Target Method do1 return:" + t2.do1(" hello!"));//本例中vi.invoke拦截器根基这个字符串长度去判断拦截里边的值
		System.out.println(" Target Method do2 return:" + t2.do2());	
		System.out.println();
		System.out.println();
	}
	public static void logic1(){
		Invocation2 iv =new Invocation2();
		Object proxy = Proxy.newProxyInstance(Thread.currentThread().getContextClassLoader(), new Class[] {Target2.class,Target1.class} , iv);
		publicLogic(proxy);
	}
	/**
	 * 错误示例：
	 * new Class[] {Target1.class}
	 * 将会出异常，因为他没有在参数中声明自己要调用Target2接口，而后面却去调用了
	* @param 
	* @return
	* @throws
	 */
	public static void logic2(){
		Invocation2 iv =new Invocation2();
		Object proxy = Proxy.newProxyInstance(Thread.currentThread().getContextClassLoader(), new Class[] {Target1.class} , iv);
		publicLogic(proxy);
	}
	public static void main(String[] args) {
		logic1();logic2();
	}
}
