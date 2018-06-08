package factorypattern.carfactory;
/**新建抽象工厂接口的普通车low工厂实现类*/
public class Car_factory_low implements Icar_factory {

	@Override
	public Icar_interface create_threeW_car() {
		Car_3W_impl_low car_3W_impl_low = new Car_3W_impl_low();
		car_3W_impl_low.setName("大众A6");
		car_3W_impl_low.setSpeed(300);
		return car_3W_impl_low;
	}

	@Override
	public Icar_interface create_audi_car() {
		Car_audi_impl_low car_audi_impl_low = new Car_audi_impl_low();
		car_audi_impl_low.setName("奥迪A6");
		car_audi_impl_low.setSpeed(300);
		return car_audi_impl_low;
	}

}
