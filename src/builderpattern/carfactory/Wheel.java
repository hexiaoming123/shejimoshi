package builderpattern.carfactory;
/**车轮类*/
public class Wheel {

	private String name;

	public Wheel(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
