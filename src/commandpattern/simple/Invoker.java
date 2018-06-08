package commandpattern.simple;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@SuppressWarnings({"rawtypes","unchecked","unused"})

public class Invoker {

	//方法二：
	private Command cmd;
	private List cmdList = new ArrayList();
	public void add(Command command){
		cmdList.add(command);
	}
	public void remove(Command command){
		cmdList.remove(command);
	}
	
	public void action(){
		
		if (cmdList.size()>0&&cmdList!=null) {
				 if ((cmd = getCmd())!= null ) {
					  for (Object obj : cmdList) {
						 System.out.println("begin"+((Command) obj).getName());
					((Command) obj).execute();
				System.out.println("end"+((Command) obj).getName());	
			}
		}
	}
}
	
	public Command getCmd(){
		//按照age从小到大优先级，排序出cmd
		Collections.sort(cmdList, new Comparator(){  
	        @Override  
	        public int compare(Object o1, Object o2) {  
	        	Command stu1=(Command)o1;  
	        	Command stu2=(Command)o2;  
	            if(stu1.getAge()>stu2.getAge()){  
	                return 1;  
	            }else if(stu1.getAge()==stu2.getAge()){  
	                return 0;  
	            }else{  
	                return -1;  
	            }  
	        }             
	    });  
		for (Object cmd : cmdList) {
			return (Command) cmd;
		}
		return null;
		
	}
	/*方法一：
	 * private Command commandOne;
	private Command commandTwo;
	public Invoker(Command commandOne, Command commandTwo) {
		this.commandOne = commandOne;
		this.commandTwo = commandTwo;
	}
	public void actionOne(){
		commandOne.execute();
	}
	public void actionTwo(){
		commandTwo.execute();
	}*/
}
