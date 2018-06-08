package mediatorpattern;
/**
 * 测试类-----中介模式
*类描述：
*@author: Administrator
*@date: 日期:2018年5月24日 时间:下午3:10:46
*@version 1.0
 */
public class MatchmakerDemo {

	public MatchmakerDemo() {}
	
	public static void main(String[] args) {
		MatchmakerDemo matchmakerDemo1 = new MatchmakerDemo();
		Matchmaker mat = new Matchmaker();//媒人出现
		Mans man = new Mans(mat);
		Woman woman = new Woman(mat);
		ManParent manp = new ManParent(mat);
		WomanParent womanp = new WomanParent(mat);
		
		System.out.println("-------------------------------------");
		man.tryst(" 我想和你约会可以吗？");
		System.out.println("-------------------------------------");
		woman.tryst(" 想和你约会");
	}
	
}
