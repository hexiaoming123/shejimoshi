package mementopattern;
/**
 * 
* @ClassName: Originator4 
* @Description: TODO 发起人角色同时还兼任负责人角色，也就是说它自己负责保持自己的备忘录对象。
* @author A18ccms a18ccms_gmail_com 
* @date 2018年5月30日 上午11:14:22 
*
 */
public class Originator4 {

	 public String state;
	    /**
	     * 改变状态
	     */
	    public void changeState(String state){
	        this.state = state;
	        System.out.println("状态改变为：" + state);
	    }
	    /**
	     * 工厂方法，返还一个新的备忘录对象
	     */
	    public Memento4 createMemento(){
	        return new Memento4(this);
	    }
	    /**
	     * 将发起人恢复到备忘录对象所记录的状态上
	     */
	    public void restoreMemento(MementoIF memento){
	        Memento4 m = (Memento4)memento;
	        System.out.println("---------恢复到备忘录所记录的状态----------");
	        changeState(m.getState());
	    }
}