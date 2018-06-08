package mementopattern;
/**
 * 
*类描述：负责人角色类
*@author: Administrator
*@date: 日期:2018年5月28日 时间:下午4:09:47
*@version 1.0
 */
public class Caretaker {
	private Memento memento;
    /**
     * 备忘录的取值方法
     */
    public Memento retrieveMemento(){
        return this.memento;
    }
    /**
     * 备忘录的赋值方法
     */
    public void saveMemento(Memento memento){
        this.memento = memento;
    }
}