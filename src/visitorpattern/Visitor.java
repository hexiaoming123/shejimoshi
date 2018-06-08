package visitorpattern;
/**
 * 
* @ClassName: Visitor 
* @Description: TODO(访问者) 
* @author A18ccms a18ccms_gmail_com 
* @date 2018年6月8日 上午10:08:50 
*
 */
public class Visitor {

	public void run(WhileCat wc){
		wc.eat();
	}
	public void run(BlackCat wc){
		wc.eat();
	}
	//方法一这个根本不用：因为接口里边是没有方法体的
	//方法二会用到：因为是继承的，但是那样写累赘了，
	//因为子类都得重写父类里边的accept方法 然后调用Visitor 的run方法才会把自己传进来
	public void run(P p) {
		p.accept(this);
	}
}
