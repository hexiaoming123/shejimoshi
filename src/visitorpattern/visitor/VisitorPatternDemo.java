package visitorpattern.visitor;
/**
 * 访问者模式的适用范围（使用场景）：
 * 
 * 	1、访问者模式把数据结构和作用于结构上的操作之间的耦合解脱开，使得操作集合可以相对自由地演化，所以适用于数据结构相对稳定的操作。

	2、对象结构中对象对应的类很少改变，但经常需要在此对象结构上定义新的操作。

	3、需要对一个对象结构中的对象进行很多不同的并且不相关的操作，而需要避免让这些操作”污染”这些对象的类，也不希望在增加新操作时修改这些类。
 * 
 * 优点：

访问者模式的优点是增加新的操作很容易，因为增加新的操作就意味着增加一个新的访问者。
访问者模式将有关的行为集中到一个访问者对象中。

缺点：

使增加新的数据结构变得困难。
* @ClassName: VisitorPatternDemo 
* @Description: TODO(这里用一句话描述这个类的作用) 
* @author A18ccms a18ccms_gmail_com 
* @date 2018年6月8日 上午11:32:27 
*
 */
public class VisitorPatternDemo {
	public static void main(String[] args) {

        ObjectStructure objectStructure = new ObjectStructure();

        //将需要被访问的element实例添加到数据结构ObjectStructure中
        objectStructure.attach(new ConcreteElementA());
        objectStructure.attach(new ConcreteElementB());

        ConcreteVisitorA concreteVisitorA = new ConcreteVisitorA();
        ConcreteVisitorB concreteVisitorB = new ConcreteVisitorB();

        //element接受访问者的访问
        objectStructure.accept(concreteVisitorA);
        objectStructure.accept(concreteVisitorB);
    }

}
