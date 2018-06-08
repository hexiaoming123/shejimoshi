package proxy;
/**代理角色---秘书类*/
public class ProxySubject2 implements Subject2 {

	private RealSubject2 realSubject;//以真实角色作为代理角色的属性	
	
	public ProxySubject2() {}

	@Override
	public void request() {//改方法封装了真实对象的request方法
		preRequest();
		if (realSubject == null) {
			realSubject = new RealSubject2();
		}
		realSubject.request();//此处执行真实对象的request方法
		postRequest();
	}

	private void preRequest() {
		System.out.println("before requesting");
	}

	private void postRequest() {
		System.out.println("after requesting");
	}
}
