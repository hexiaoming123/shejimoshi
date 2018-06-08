package decoratorpattern.piledriving;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Decorator implements Work {

	private Work work;
	//额外增加的功能打包在这个List中
	private List others = new ArrayList();
	
	public Decorator(Work work) {
		this.work = work;
		others.add("挖坑");
		others.add("钉木板");
	}

	@Override
	public void insert() {
		newMethod();

	}
	//在新方法中，我们在insert之前增加其他方法，这里次序先后是用户灵活指定的
	private void newMethod() {

		otherMethod();
		work.insert();
	}

	private void otherMethod() {
		ListIterator listiterator = others.listIterator();
		while (listiterator.hasNext()) {
			Object object = (Object) listiterator.next();
		System.out.println(object+"正在进行");	
		}
	}

}
