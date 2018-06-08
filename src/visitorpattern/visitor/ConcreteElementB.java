package visitorpattern.visitor;

/**
 * 具体元素对象ConcreteElementB，实现接受访问者访问的accept()方法
 * @author LMB
 *
 */
public class ConcreteElementB extends Element {

    @Override
    public void accept(Visitor visitor) {
        visitor.visitConcreteElementB(this);        
    }

    //其它相关方法
    public void operationB(){}

}
