package factorypattern.carfactory;
/**新建大众高级车*/
public class Car_3W_impl_adv extends Base_car_impl {
	//private int speed;
	@Override
	public void start() {
		System.out.println("富华版："+this.getName()+"车以专利技术启动了最高速度为："+this.getSpeed());
	}

	@Override
	public void stop() {
		System.out.println("富华版："+this.getName()+"车以专利技术停车了。");
	}

	/*public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}*/
	
}
