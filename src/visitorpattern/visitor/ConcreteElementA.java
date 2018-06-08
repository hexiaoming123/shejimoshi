package visitorpattern.visitor;

/**
 * 具体元素对象ConcreteElementA，实现接受访问者访问的accept()方法
 * @author LMB
 *
 */
public class ConcreteElementA extends Element {

    @Override
    public void accept(Visitor visitor) {
        visitor.visitConcreteElementA(this);        
    }

    //其它相关方法
    public void operationA(){}

}
