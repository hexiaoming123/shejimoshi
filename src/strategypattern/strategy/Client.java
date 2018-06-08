package strategypattern.strategy;
/**测试类
 * 策略模式的控制权在客户端，业务逻辑能够很好的剥离。
 * 而状态模式需要我们对整个业务中的状态进行抽象，并且需要对顶层State接口中的方法进行抽象。
 * */
public class Client {
	public static void main(String[] args) {
	 Player player = new Player();
     player.buy(5000D);
     System.out.println("玩家需要付钱：" + player.calLastAmount());
     player.buy(6000D);
     System.out.println("玩家需要付钱：" + player.calLastAmount());
     player.buy(6000D);
     System.out.println("玩家需要付钱：" + player.calLastAmount());
     player.buy(7000D);
     System.out.println("玩家需要付钱：" + player.calLastAmount());
    }

}
