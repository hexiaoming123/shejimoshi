package flyweightpattern.flyweight;
//用于本模式的抽象数据类型（自行设计）
public interface ExtrinsicState {
 	//执行卖出动作
	public abstract void sell();
	//获取咖啡味道
	public abstract String getFlavor();
}
