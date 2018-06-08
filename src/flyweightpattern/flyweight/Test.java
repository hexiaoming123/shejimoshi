package flyweightpattern.flyweight;
/**
 * 
*类描述：测试如果工厂创建了Flyweight接口对象就不再创建Flyweight接口对象
*@author: Administrator
*@date: 日期:2018年5月25日 时间:下午4:12:29
*@version 1.0
 */
public class Test {

	public static void main(String[] args) {

		FlyweightFactory factoty = new FlyweightFactory();
		Flyweight fly1 = factoty.getFlyweight("feiji");
		Flyweight fly2 = factoty.getFlyweight("dapao");
		Flyweight fly3 = factoty.getFlyweight("dapao");
		ExtrinsicState ext = new extrinsicimpl("摩卡");
		if (fly1.equals(fly2) && fly1.equals(fly3)) {
			System.out.println("新创建fly1接口对象");
			fly1.operation(ext);
		} else if (fly1.equals(fly2) && !fly1.equals(fly3)) {
			System.out.println("新创建fly1:fly3接口对象");
			fly1.operation(ext);
			fly3.operation(ext);
		} else if (!fly1.equals(fly2) && fly1.equals(fly3)) {
			System.out.println("新创建fly1:fly2接口对象");
			fly1.operation(ext);
			fly2.operation(ext);
		} else if (!fly1.equals(fly2) && !fly1.equals(fly3)) {
			System.out.println("新创建fly1接口对象");
			fly1.operation(ext);
			// 判断2和3是否相等
			if (fly2.equals(fly3)) {
				System.out.println("新创建fly2接口对象");
				fly2.operation(ext);
			} else {
				System.out.println("新创建fly3接口对象");
				fly3.operation(ext);
			}
		}
	}

}
