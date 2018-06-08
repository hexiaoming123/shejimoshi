package commandpattern.simple;

import mementopattern.Memento;
/**加入返回一步的备忘录*/
public class ConcreteCommandOne implements Command {

	private Receiver receiver;
	private Receiver lastReceiver;
	public ConcreteCommandOne(Receiver receiver){
		this.receiver = receiver;
	}
	@Override
	public void execute() {
		record();
		receiver.actionOne();
	}
	public void undo(Mement memento){
		//恢复状态
	    this.receiver = memento.getReceiver();
	}
	//方法暂时没用
	public void redo(){
		lastReceiver.actionOne();
	}
	public Mement record(){
		//记录状态
		return  new Mement(this.receiver);
	}
	
	@Override
	public int getAge() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}

}
