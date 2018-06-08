package commandpattern.tv;
/**带有main方法的测试类 （命令发送者）*/
public class CommandTest {
	public static void main(String[] args) {
		//命令接受者
		Tv tv = new Tv();
		//开机命令
		CommandOn on = new CommandOn(tv);
		//关机命令
		CommandOff off = new CommandOff(tv);
		//频道切换命令
		CommandChannel channel = new CommandChannel(tv,6);
		//命令控制对象
		Control control = new Control(on, off, channel);
		//开机
		control.turnOn();
		//切换频道
		control.turnChannel();
		//关机
		control.turnOff();
	}
}
