package proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class DynamicSubject implements InvocationHandler{
	private Object sub;
	
	public DynamicSubject() {}
	public DynamicSubject(Object obj) {
		this.sub = obj;
	}
	
	public Object getObj() {
		return sub;
	}
	public void setObj(Object sub) {
		this.sub = sub;
	}
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("before calling: " +method);
		method.invoke(sub, args);
		System.out.println("after calling: " +method);
		return null;
	}
	
}
