package factorypattern.carfactory;
/**汽车父类*/
public class Base_car_impl implements Icar_interface {

	private int speed;
	private String name;
	
	@Override
	public void start() {
		
	}

	@Override
	public void stop() {
		
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
}
