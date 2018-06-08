package commandpattern.tv;
/**频道切换命令类*/
public class CommandChannel implements Command {

	private int channel;
	private Tv tv ;
	
	public CommandChannel(Tv tv,int channel){
		this.channel = channel;
		this.tv = tv;
	}
	
	@Override
	public void execute() {

		tv.turnChannel(channel);
	}

}
