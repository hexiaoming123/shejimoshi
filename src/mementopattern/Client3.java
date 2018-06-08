package mementopattern;
/**客户端角色类
 * https://www.cnblogs.com/java-my-life/archive/2012/06/06/2534942.html*/
public class Client3 {
    public static void main(String[] args) {
        
    	Originator3 o = new Originator3();
        Caretaker3 c = new Caretaker3(o);
        //改变状态
        o.setState("state 0");
        //建立一个检查点
        c.createMemento();
        //改变状态
        o.setState("state 1");
        //建立一个检查点
        c.createMemento();
        //改变状态
        o.setState("state 2");
        //建立一个检查点
        c.createMemento();
        //改变状态
        o.setState("state 3");
        //建立一个检查点
        c.createMemento();
        //打印出所有检查点
        o.printStates();
        System.out.println("-----------------恢复检查点-----------------");
        //恢复到第三个检查点
        c.restoreMemento(2);
        //打印出所有检查点
        o.printStates();
    }

}
