package mementopattern;

import java.util.ArrayList;
import java.util.List;

/**多重检查点
*类描述：发起人角色类
*@author: Administrator
*@date: 日期:2018年5月28日 时间:下午4:07:10
*@version 1.0
 */
public class Originator3 {

	private List<String> states;
	//检查点指数
	private int index;
	
    /**
     * 
    *@date: 日期:2018年5月28日 时间:下午5:36:57
    *@param 
    *@return 构造函数
     */
    public Originator3() {
    	states =new ArrayList<String>();
    	index = 0;
	}

	public Originator3(List<String> states, int index) {
		this.states = states;
		this.index = index;
	}

	public List<String> getStates() {
        return states;
    }
    
    public void setState(String state) {
        states.add(state);
        index++;
    }
    /**
     * 辅助方法，打印所有状态
     */
    public void printStates(){
    	System.out.println("檢查點共有："+states.size()+"个");
    	for (String state : states) {
			System.out.println(state);
		}
    	
    }
    /**
     * 工厂方法，返回一个新的备忘录对象
     */
    public Memento3 createMemento(){
        return new Memento3(states,index);
    }
    /**
     * 发起人恢复到备忘录对象记录的状态
     */
    public void restoreMemento(Memento3 memento){
    	System.out.println("恢复检查点共有："+memento.getStates().size()+"个");
        states = memento.getStates();
        index = memento.getIndex();
    }

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}

}