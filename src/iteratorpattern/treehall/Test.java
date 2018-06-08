package iteratorpattern.treehall;

import java.util.ArrayList;
import java.util.Iterator;
public class Test {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add("a2");list.add("a1");
		list.add("a3");list.add("a4");
		for (Iterator i = (Iterator) list.iterator();i.hasNext();) {
			System.out.println(i.next().toString());
		}
	}
}
