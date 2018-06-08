package visitorpattern;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * java的静态单分派,动态多分派示例
 * 
 * 重载是静态分派,在编译时期执行，取决于变量的声明类型。
 * 因为wc，bc都是Cat所以调用的都是feed（Cat cat）的函数。
 * 
 * 重写是动态多分派，bc.eat()在执行期间发生了向下转型执行的BlackCat类的 eat()函数
 * */
public class Person {

	public void feed(Cat cat){
		System.out.println("feed cat");
	}
	public void feed(WhileCat cat){
		System.out.println("feed cat");
	}
	public void feed(BlackCat cat){
		System.out.println("feed cat");
	}
	
	public static void main(String[] args) {
		
		Cat wc = new WhileCat();
		Cat bc = new BlackCat();
		Person p = new Person();
		/*静态单分派*/
		p.feed(wc);//feed cat
		p.feed(bc);//feed cat
		/*动态多分派*/
		wc.eat();//WhileCat cat
		bc.eat();//BlackCat cat
	}
}
