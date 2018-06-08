package commandpattern.tv;
/**命令接受者对象类*/
public class Tv {

	private int currentChannel = 0;
	public void turnOn(){
		System.out.println(" The televisino on");
	}
	public void turnOff(){
		System.out.println(" The televisino off");
	}
	public void turnChannel(int channel){
		this.currentChannel = channel;
		System.out.println(" Now TV channel is:CCTV-" + currentChannel);
	}
	//get set 方法和构造类没写
}
