package proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Proxy;
/**
 * 
*类描述：动态代理测试类
*@author: Administrator
*@date: 日期:2018年5月25日 时间:上午11:46:49
*@version 1.0
 */
public class Client {
	
	public static void main(String[] args) throws NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		RealSubject rs = new RealSubject();//在这里指定被代理类
		InvocationHandler ds = new DynamicSubject(rs);//初始化代理类
		Class cls = rs.getClass();
		//以下是分解步驟
//		Class c =Proxy.getProxyClass(cls.getClassLoader(), cls.getInterfaces());
//		Constructor ct =c.getConstructor(new Class[] {InvocationHandler.class});
//		Subject subject = (Subject) ct.newInstance(new Object[] {ds});
		//以下是一次性生成
		Subject subject = (Subject) Proxy.newProxyInstance(cls.getClassLoader(), cls.getInterfaces(), ds);
		subject.request();
	}
}
/*  main:
 * 	before calling: public abstract void proxy.Subject.request()
	From real subject
	after calling: public abstract void proxy.Subject.request()
 * */
 