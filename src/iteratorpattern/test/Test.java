package iteratorpattern.test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test {

	List<String> list = new ArrayList<String>();
	public Test(){};
	public void add(){
		for (int i = 0; i < 1000; i++) {
			list.add(String.valueOf(i));
		}
	}
	public void read(){
		Iterator iterrator =  list.iterator();
		while (iterrator.hasNext()) {
			System.out.println(iterrator.next());
			
		}
	}
}
