package commandpattern.simple;

import java.util.ArrayList;
import java.util.List;
/**
 * 这个命令组合会被多次执行
 * 加入合成模式
 * */
public class MacroCommand implements Command {

	private List cmdList = new ArrayList();
	public void add(Command command){
		cmdList.add(command);
	}
	public void remove(Command command){
		cmdList.add(command);
	}
	
	@Override
	public void execute() {
		Command cmd ;
		for (Object obj : cmdList) {
			((Command) obj).execute();
		}

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
