package commandpattern.simple;

public class CommandTwo implements Command {
	
	private int age  =1;
	private Receiver receiver;
	public CommandTwo(Receiver receiver){
		this.receiver = receiver;
	}
	@Override
	public void execute() {
		receiver.actionTwo();

	}
	@Override
	public String getName() {
		
		return CommandTwo.class.getName();
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

}
