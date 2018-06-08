package factorypattern.carfactory;

public class Car_audi_impl_low extends Base_car_impl {
	@Override
	public void start() {
		System.out.println("普通版："+this.getName()+"车以专利技术启动了最高速度为："+this.getSpeed());
	}

	@Override
	public void stop() {
		System.out.println("普通版："+this.getName()+"车以专利技术停车了。");
	}
}
