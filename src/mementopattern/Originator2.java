package mementopattern;

/**
 * “黑箱”备忘录模式的实现
*类描述：发起人角色类
*@author: Administrator
*@date: 日期:2018年5月28日 时间:下午4:07:10
*@version 1.0
 */
public class Originator2 {

    private String state;
   
    
    public String getState() {
        return state;
    }
    
    public void setState(String state) {
        this.state = state;
        System.out.println("赋值状态：" + state);
    }
    /**
     * 工厂方法，返回一个新的备忘录对象
     */
    public MementoIF createMemento(){
        return new Memento(state);
    }
    /**
     * 发起人恢复到备忘录对象记录的状态
     */
    public void restoreMemento(MementoIF memento){
        this.setState(((Memento) memento).getState()); 
    }
    private class Memento implements MementoIF{
    	private	String state;

		public String getState() {
			return state;
		}

		public void setState(String state) {
			this.state = state;
		}

		public Memento(String state) {
			super();
			this.state = state;
		}
    	
    }
}