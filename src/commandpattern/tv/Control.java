package commandpattern.tv;
/**
 * 1. Control.java 命令控制者对象类  2. Tv.java 命令接受者对象类  3. Command.java 命令接口  
 * 4. CommandChannel.java 频道切换命令类 5. CommandOn.java 开机命令类  
 * 6. CommamdOff.java 关机命令类  7.CommandTest.java 带有main方法的测试类 （命令发送者）
* @ClassName: Control 
* @Description: TODO(命令控制类) 
* @author A18ccms a18ccms_gmail_com 
* @date 2018年6月6日 上午10:20:49 
*
 */
public class Control {

	private Tv tv;
	private Command OnCommand , OffCommand , ChannelCommand;
	public Control(Command on, Command off, Command channel){
		this.OnCommand = on;
		this.OffCommand = off;
		this.ChannelCommand = channel;
	}
	public void turnOn(){
		OnCommand.execute();
	}
	public void turnOff(){
		OffCommand.execute();
	}
	public void turnChannel(){
		ChannelCommand.execute();
	}
}
