package builderpattern.carfactory;

import java.util.ArrayList;
import java.util.List;

/**汽车类抽象接口*/
public abstract class Car {
	
	public abstract void AddBody(Body body);//车身
	public abstract void AddEngine(Engine engine);//引擎
	public abstract void AddWheel(Wheel wheel);//轮子
	public abstract void ShowMe() ;
}