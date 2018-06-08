package visitorpattern;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		

		P whc = new WhileCat();
		P blc = new BlackCat();
		List list = new ArrayList();
		list.add(whc);
		list.add(blc);
		
		Visitor v = new Visitor();
		Iterator ie = list.iterator();
		while (ie.hasNext()) {
			P pl = (P) ie.next();
			//方法1:比较麻烦
			/*if (pl instanceof WhileCat) {
				((WhileCat) pl).eat();
			}
			if (pl instanceof BlackCat) {
				((BlackCat) pl).eat();
			}*/
			//方法1:重写和重载组合使用
			pl.accept(v);
		}
	}
}
