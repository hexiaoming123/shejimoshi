package mementopattern;
/**
 *“白箱”备忘录模式的实现 
*类描述：发起人角色类
*@author: Administrator
*@date: 日期:2018年5月28日 时间:下午4:07:10
*@version 1.0
 */
public class Originator {

    private String state;
    /**
     * 工厂方法，返回一个新的备忘录对象
     */
    public Memento createMemento(){
        return new Memento(state);
    }
    /**
     * 将发起人恢复到备忘录对象所记载的状态
     */
    public void restoreMemento(Memento memento){
        this.state = memento.getState();
    }
    
    public String getState() {
        return state;
    }
    
    public void setState(String state) {
        this.state = state;
        System.out.println("当前状态：" + this.state);
    }
	
    
}