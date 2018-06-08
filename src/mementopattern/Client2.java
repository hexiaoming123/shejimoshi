package mementopattern;
/**客户端角色类
 * https://www.cnblogs.com/java-my-life/archive/2012/06/06/2534942.html
 * 客户端首先

　　（1）将发起人对象的状态设置为“On”。

　　（2）调用createMemento()方法，创建一个备忘录对象将这个状态存储起来（此时createMemento()方法还回的明显类型是MementoIF接口，真实类型为Originator内部的Memento对象）。

　　（3）将备忘录对象存储到负责人对象中去。由于负责人对象拿到的仅是MementoIF接口，因此无法读出备忘录对象内部的状态。

　　（4）将发起人对象的状态设置为“Off”。

　　（5）调用负责人对象的retrieveMemento()方法将备忘录对象取出。注意此时仅能得到MementoIF接口，因此无法读出此对象的内部状态。

　　（6）调用发起人对象的restoreMemento()方法将发起人对象的状态恢复成备忘录对象所存储的起来的状态，即“On”状态。由于发起人对象的内部类Memento实现了MementoIF接口，这个内部类是传入的备忘录对象的真实类型，因此发起人对象可以利用内部类Memento的私有接口读出此对象的内部状态。*/
public class Client2 {
    public static void main(String[] args) {
        
        Originator2 o = new Originator2();
        Caretaker2 c = new Caretaker2();
        //改变负责人对象的状态
        o.setState("On");
        //创建备忘录对象，并将发起人对象的状态储存起来
        c.saveMemento(o.createMemento());
        //修改发起人的状态
        o.setState("Off");
        //恢复发起人对象的状态
        o.restoreMemento(c.retrieveMemento());
        
        System.out.println(o.getState());
    }

}
