package builderpattern.carfactory;
/**汽车经销商类*/
public class Producer {

	private CarBuilder builder;
	
	/**汽车经销商联系汽车制造厂*/
	public Producer(CarBuilder builder) {
		this.builder = builder;
	}/**汽车经销商订购汽车制造厂汽车*/
	public void Construct(){
		builder.BuildBody();
		builder.BuildEngine();
		builder.BuildWheel(" front left");
		builder.BuildWheel(" front right");
		builder.BuildWheel(" back left");
		builder.BuildWheel(" back right");
	}
	
}
