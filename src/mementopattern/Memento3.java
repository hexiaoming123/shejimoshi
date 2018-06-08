package mementopattern;

import java.util.ArrayList;
import java.util.List;

/**
 * 
*类描述：备忘录角色类，这个实现可以存储任意多的状态，外界可以使用检查点指数index来取出检查点上的状态。　
*@author: Administrator
*@date: 日期:2018年5月28日 时间:下午4:07:49
*@version 1.0
 */
public class Memento3 {
	private List<String> states;
    private int index;
    
    public Memento3(List<String> states ,int index){
        this.states = new ArrayList<String>(states);
        this.index =index;
    }
	public List<String> getStates() {
		return states;
	}
	public int getIndex() {
		return index;
	}
}