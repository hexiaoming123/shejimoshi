package commandpattern.tv;
/**关机命令类*/
public class CommandOff implements Command {

	private Tv tv;
	public CommandOff(Tv tv){
		this.tv = tv;
	}
	
	@Override
	public void execute() {
		tv.turnOff();
	}

}
