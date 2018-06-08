package flyweightpattern.flyweight;

public class ConcreteFlyweight implements Flyweight {
		public static int i =1;
	@Override
	public void operation(ExtrinsicState state) {
		state.sell();
		System.out.println(state.getFlavor());
	}

	public ConcreteFlyweight() {
		System.out.println("新建了"+i+"ConcreteFlyweight");
		i++;
	}

}
