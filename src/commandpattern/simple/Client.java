package commandpattern.simple;

public class Client {

	public static void main(String[] args) {
		Receiver receiver = new Receiver();
		Command commandOne = new CommandOne(receiver);
		Command commandTwo = new CommandTwo(receiver);
		/*方法一：
		 * 没有排序功能
		 * Invoker invoker = new Invoker(commandOne, commandTwo);
		invoker.actionOne();
		invoker.actionTwo();*/
		//方法二：有排序功能
		Invoker invoker = new Invoker();
		invoker.add(commandOne);
		invoker.add(commandTwo);
		invoker.action();
	}
}
