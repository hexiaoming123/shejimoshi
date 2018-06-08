package mementopattern;
/**
 * 
*类描述：负责人角色类
*负责人角色类Caretaker能够得到的备忘录对象是以MementoIF为接口的，
*由于负责人对象拿到的仅是MementoIF接口，因此无法读出备忘录对象内部的状态。
*@date: 日期:2018年5月28日 时间:下午4:09:47
*@version 1.0
 */
public class Caretaker2 {

	private MementoIF memento;
    /**
     * 备忘录的取值方法
     */
    public MementoIF retrieveMemento(){
        return this.memento;
    }
    /**
     * 备忘录的赋值方法
     */
    public void saveMemento(MementoIF memento){
        this.memento = memento;
    }
}