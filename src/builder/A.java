package builder;
/**
 * 
*类描述：三种放法都会导致栈内存溢出 //栈溢出抛出StackOverflowError错误
*@date: 日期:2018年5月26日 时间:上午8:39:05
*@admin
*@version 1.0
 */
public class A {
		A a_a = new A();
	public A(){
		A _a = new A();
		A A_B =new A();
	}
}
