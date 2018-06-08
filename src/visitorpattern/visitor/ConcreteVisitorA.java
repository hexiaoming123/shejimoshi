package visitorpattern.visitor;

/**
 * 具体访问者ConcreteVisitorA，实现每个由Visitor声明的操作。每个操作实现算法的一部分，而该算法
 * 乃是对应于结构中对象的类
 * @author LMB
 *
 */
public class ConcreteVisitorA extends Visitor {

    @Override
    public void visitConcreteElementA(ConcreteElementA concreteElementA) {
        System.out.println(concreteElementA.getClass() + "被" + this.getClass() + "访问");     
    }

    @Override
    public void visitConcreteElementB(ConcreteElementB concreteElementB) {
        System.out.println(concreteElementB.getClass() + "被" + this.getClass() + "访问");         
    }

}