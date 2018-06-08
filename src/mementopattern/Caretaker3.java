package mementopattern;

import java.util.ArrayList;
import java.util.List;

/**
 * 
*类描述：负责人角色类
*@author: Administrator
*@date: 日期:2018年5月28日 时间:下午4:09:47
*@version 1.0
 */
public class Caretaker3 {
	private Originator3 o;
    private List<Memento3> mementos = new ArrayList<Memento3>();
    private int current;
    /**
     * 构造函数
     */
	public Caretaker3(Originator3 o) {
		this.o = o;
		current = 0;
	}
    /**创建一个新檢查点*/
	public int createMemento(){
		Memento3 memento = o.createMemento();
		mementos.add(memento);
		return current++;
	}
	/**
     * 将发起人恢复到某个检查点
     */
	 public void restoreMemento(int index){
	        Memento3 memento = mementos.get(index);
	        o.restoreMemento(memento);
	    }
	    /**
	     * 将某个检查点删除
	     */
	    public void removeMemento(int index){
	        mementos.remove(index);
	    }
}