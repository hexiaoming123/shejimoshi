package templatemethod;
/**
 * 具体模板角色类
* @ClassName: ConcreteTemplate 
* @Description: TODO(　模板模式的关键是：子类可以置换掉父类的可变部分，但是子类却不可以改变模板方法所代表的顶级逻辑。) 
* @author A18ccms a18ccms_gmail_com 
* @date 2018年6月4日 下午3:36:14 
*基本方法又可以分为三种：抽象方法(Abstract Method)、具体方法(Concrete Method)和钩子方法(Hook Method)。

　　●　　抽象方法：一个抽象方法由抽象类声明，由具体子类实现。在Java语言里抽象方法以abstract关键字标示。

　　●　　具体方法：一个具体方法由抽象类声明并实现，而子类并不实现或置换。

　　●　　钩子方法：一个钩子方法由抽象类声明并实现，而子类会加以扩展。通常抽象类给出的实现是一个空实现，作为方法的默认实现。

　　		在上面的例子中，AbstractTemplate是一个抽象类，它带有三个方法。其中abstractMethod()是一个抽象方法，
		它由抽象类声明为抽象方法，并由子类实现；hookMethod()是一个钩子方法，它由抽象类声明并提供默认实现，并且由子类置换掉。
		concreteMethod()是一个具体方法，它由抽象类声明并实现。
 */
public class ConcreteTemplate extends AbstractTemplate {
	/**
	 * 子类中的方法的访问级别不能低于父类中该方法的访问级别，为何呢？
	 * 假如没有这个限制， 如果Child类的 outPut() 方法的访问级别为 private ，
	 * 将会与 java 的多态机制发生冲突。Parent parent = new Child();
	 *  parent.outPut(); 这里Java 编译器会认为以上是合法的，但在运行时，根据动态绑定规则，
	 *  Java虚拟机会调用 parent 变量所引用的 Child 实例的 outPut()  方法，
	 *  而 Child 的 outPut() 方法为 private，Java虚拟机无法访问。为了避免这样的矛盾，
	 *   Java 虚拟机不允许子类方法缩小父类中被覆盖方法的访问权限。
	 * */
	//基本方法的实现
	@Override
	public void abstractMethod() {
		// TODO 业务相关代码
	}
	//重写父类的方法
	@Override
	public void hookMethod(){
		//业务相关代码
	}

}
