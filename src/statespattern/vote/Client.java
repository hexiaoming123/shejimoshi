package statespattern.vote;
/**
 * 
* @ClassName: Client 
* @Description: TODO 客户类
* 
* 状态模式/操作型模式所涉及到的角色有：

　　●　　环境(Context)角色，也成上下文：定义客户端所感兴趣的接口，并且保留一个具体状态类的实例。这个具体状态类的实例给出此环境对象的现有状态。

　　●　　抽象状态(State)角色：定义一个接口，用以封装环境（Context）对象的一个特定的状态所对应的行为。

　　●　　具体状态(ConcreteState)角色：每一个具体状态类都实现了环境（Context）的一个状态所对应的行为。
* @author A18ccms a18ccms_gmail_com 
* @date 2018年5月30日 下午4:51:05 
*
 */
public class Client {
	public static void main(String[] args) {
		VoteManager vm = new VoteManager();
		for (int i = 0; i < 10; i++) {
			vm.vote("小花", "A");
			System.out.println(vm.getMapVote());
		}
		
	}
}
