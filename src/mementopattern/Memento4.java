package mementopattern;
/**
 * 
* @ClassName: Memento4 
* @Description: TODO 简单备忘录类
* @author A18ccms a18ccms_gmail_com 
* @date 2018年5月30日 上午10:55:46 
*
 */
public class Memento4 implements MementoIF {
	 private String state;
     /**
      * 构造方法
      */
     public Memento4(Originator4 o){
         this.state = o.state;
     }
     public String getState() {
         return state;
     }
	public void setState(String state) {
		this.state = state;
	}
     
 }
