package visitorpattern.visitor;

import java.util.ArrayList;
import java.util.List;
/**
 * ObjectStructure类，能每句它的元素，可以提供一个高层的接口以允许访问者访问它的元素
 * @author LMB
 *
 */
public class ObjectStructure {

    private List<Element> elements = new ArrayList<Element>();

    //添加元素
    public void attach(Element element){
        elements.add(element);
    }

    //移除元素
    public void detach(Element element){
        elements.remove(element);
    }

    //元素接受访问者访问
    public void accept(Visitor visitor){
        for (Element e : elements) {
            e.accept(visitor);
        }
    }


}
