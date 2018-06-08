package flyweightpattern.flyweight;

public class extrinsicimpl implements ExtrinsicState {

private String flavor;
	
	public extrinsicimpl(String flavor) {
		this.flavor = flavor;
	}

	@Override
	public void sell() {
		System.out.println(" 卖出了一杯[ "+flavor +"  ]。");		
	}

	@Override
	public String getFlavor() {
		return "共"+ this.flavor.length()+"杯"+this.flavor;
	}
}
