package mementopattern;
/**客户端角色类--“自述历史”模式
 * https://www.cnblogs.com/java-my-life/archive/2012/06/06/2534942.html*/
public class Client4 {
    public static void main(String[] args) {
    	        Originator4 o = new Originator4();
    	        //修改状态
    	        o.changeState("state 0");
    	        //创建备忘录
    	        MementoIF memento = o.createMemento();
    	        //修改状态
    	        o.changeState("state 1");
    	      //  memento =  o.createMemento();
    	        //按照备忘录恢复对象的状态
    	        o.restoreMemento(memento);
    	    }

    	}