package builderpattern.carfactory;
/**汽车制造厂抽象接口*/
public abstract class CarBuilder {
	
	public abstract void BuildBody();//生产车身
	public abstract void BuildEngine();//生产引擎
	public abstract void BuildWheel(String name);//生产车轮
}
