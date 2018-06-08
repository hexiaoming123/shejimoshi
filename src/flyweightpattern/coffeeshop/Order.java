package flyweightpattern.coffeeshop;

public abstract class Order {
	public abstract void serve(Table table);
	public abstract String getFlavor();
}
