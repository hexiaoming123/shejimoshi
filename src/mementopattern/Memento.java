package mementopattern;
/**
 * 
*类描述：备忘录角色类
*@author: Administrator
*@date: 日期:2018年5月28日 时间:下午4:07:49
*@version 1.0
 */
public class Memento {
private String state;
    
    public Memento(String state){
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
    
}