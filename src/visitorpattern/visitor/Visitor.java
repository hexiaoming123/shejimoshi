package visitorpattern.visitor;

/**
 * Visitor类，为该对象结构中的ConcreteElement的每一个实现类声明一个visit操作
 * 
 *
 */
public abstract class Visitor {

    public abstract void visitConcreteElementA(ConcreteElementA concreteElementA);
    public abstract void visitConcreteElementB(ConcreteElementB concreteElementB);

}