package proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**动态代理类
 * TODO 耦合类(耦合是为了解耦)*/
public class Invocation2 implements InvocationHandler{
	public void invokeDoSomething(){
		TargetImpl t = new TargetImpl();
		Intercept p = new Intercept();
		//调用真实的标的类的方法的前置入拦截类的方法
		p.before();
		//调用真实的标的类的方法
		t.doSomething();
		//调用真实的标的类的方法之后置入拦截类的方法
		p.after();
		return;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		TargetImpl t = new TargetImpl();
		Intercept p = new Intercept();
		if (args != null &&args.length == 1) {
			//更改参数
			args[0] = "param value has changed";
		}
		//调用真实的标的类的方法之前置入拦截类的方法
		p.before();
		//调用真实的标的类的方法
		Object o = method.invoke(t, args);
		//调用真实的标的类的方法之后置入拦截类的方法
		p.after();
		return o;
	}
}
