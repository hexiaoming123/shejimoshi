package flyweightpattern.coffeeshop;

public class Flavor extends Order {

	private String flavor;
	
	public Flavor(String flavor) {
		this.flavor = flavor;
	}
	@Override
	public String getFlavor() {
		return flavor;

	}
	public void setFlavor(String flavor) {
		this.flavor = flavor;
	}

	@Override
	public void serve(Table table) {
		System.out.println("Serving table" +table.getNumber()+"--with flavor:"+flavor);
	}
}
