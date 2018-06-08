package proxy;
/**代理角色*/
public class ProxySubject implements Subject {

	private RealSubject realSubject;//以真实角色作为代理角色的属性	
	
	public ProxySubject() {}

	@Override
	public void request() {//改方法封装了真实对象的request方法
		preRequest();
		if (realSubject == null) {
			realSubject = new RealSubject();
		}
		realSubject.request();//此处执行真实对象的request方法
		postRequest();
	}

	private void preRequest() {
		System.out.println("request之前过滤处理数据");
	}

	private void postRequest() {
		System.out.println("之后增加post方法请求");
	}
}
