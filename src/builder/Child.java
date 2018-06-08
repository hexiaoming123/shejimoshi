package builder;

public class Child extends SuperClassDemo{
	//构造器不能被继承，方法可以被继承，类中加不加 和默认构造器和super（），java编译后都会默认加入
	public Child() {
		super();
	}
	public Child( String age) {
		super(age);
	}
	public static void main(String[] args) {
		Child c = new Child("年龄");
		//调用父类的name属性
		System.out.println(c.name);
	}
}
