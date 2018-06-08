package visitorpattern;
/**方法一：*/
public interface P {

	void accept(Visitor v);
}
/*方法二：
 * 如果是树上写的就是继承了而不是实现
 * public class P {
 

	public void accept(Visitor v){
		v.run(this);
	}
}*/