package commandpattern.simple;

public class CommandOne implements Command {

	private int age =2;
	private Receiver receiver;
	public CommandOne(Receiver receiver){
		this.receiver = receiver;
	}
	@Override
	public void execute() {
		receiver.actionOne();

	}
	@Override
	public String getName() {
		
		return CommandOne.class.getName();
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}
