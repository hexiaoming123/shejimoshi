package visitorpattern;
/**方法一：*/
public class WhileCat extends Cat implements P {
	//方法二：
	//public class WhileCat extends Cat  {
	@Override
	public void eat(){
		System.out.println("WhileCat eat");
	}

	@Override
	public void accept(Visitor v) {
		v.run(this);
		
	}
}
