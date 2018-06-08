package commandpattern.tv;
/**开机命令类*/
public class CommandOn implements Command {

	private Tv tv;
	public CommandOn(Tv tv){
		this.tv = tv;
	}
	
	@Override
	public void execute() {
		tv.turnOn();
	}

}
