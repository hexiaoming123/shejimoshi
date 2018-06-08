package flyweightpattern.flyweight;

import java.util.Hashtable;

/**工厂类*/
public class FlyweightFactory {
	//Flyweight poll
	private Hashtable flyweights =new Hashtable();
	public Flyweight getFlyweight(Object key){
		Flyweight flyweight =(Flyweight) flyweights.get(key);
		if (flyweight == null) {
			//产生新的ConcreteFlyweight
			flyweight = new ConcreteFlyweight();
			flyweights.put(key, flyweight);
		}
		return flyweight;
	}
}
