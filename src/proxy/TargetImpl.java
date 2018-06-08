package proxy;
/**
 * 代理分为静态代理与动态代理。我按功能将代理的组成类分为：标的类、标的接口、拦截类、耦合类
*类描述：
*@author: Administrator
*@date: 日期:2018年5月24日 时间:下午6:06:47
*@version 1.0
 */
public class TargetImpl implements Target1,Target2{

	@Override
	public String do1(String msg) {
		System.out.println("do1:"+ msg);
		return "this is String Method!";
	}

	@Override
	public int do2() {
		System.out.println("do2!");
		return 1000;
	}

	@Override
	public void doSomething() {
		System.out.println( " doSomething!");
	}
	
}
