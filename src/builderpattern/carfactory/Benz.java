package builderpattern.carfactory;

import java.io.Console;
import java.util.ArrayList;
import java.util.List;

/**汽车类*/
public class Benz extends Car{

	private Body body;
	private Engine engine;
	private List<Wheel> wheels = new ArrayList<Wheel>();
	public void AddBody(Body body){
		this.body =body;
	}
	public void AddEngine(Engine engine){
		this.engine =engine;
	}
	public void AddWheel(Wheel wheel){
	
		if (wheel == null) {
			wheels = new ArrayList<Wheel>();
		}
		wheels.add(wheel);
	}
	/**汽车类-查看汽车*/
	public void ShowMe(){
		if (this.body == null || this.engine == null || this.wheels == null) {
			System.out.println(" This car has NOT been completed yet !");
		}else{
			System.out.println("This is a car with a" + body.getName() + "and a "+engine.getName()+". ");
			System.out.println("This car contains"+ wheels.size()+ "wheels:");
			for (int i = 0; i < wheels.size(); i++) {
				Wheel wheel =wheels.get(i);
				System.out.println(wheel.getName());
			}
		}
	}
	public Body getBody() {
		return body;
	}
	public void setBody(Body body) {
		this.body = body;
	}
	public Engine getEngine() {
		return engine;
	}
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	public List<Wheel> getWheels() {
		return wheels;
	}
	public void setWheels(List<Wheel> wheels) {
		this.wheels = wheels;
	}
	
}
