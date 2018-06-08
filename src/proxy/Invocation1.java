package proxy;
/**静态代理类
 * TODO 耦合类(耦合是为了解耦)*/
public class Invocation1 {
	public Object invokeDoSomething(){
		TargetImpl t = new TargetImpl();
		Intercept p = new Intercept();
		//调用真实的标的类的方法的前置入拦截类的方法
		p.before();
		//调用真实的标的类的方法
		t.doSomething();
		//调用真实的标的类的方法之后置入拦截类的方法
		p.after();
		return null;
	}
}
