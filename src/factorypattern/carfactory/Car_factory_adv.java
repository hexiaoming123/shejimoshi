package factorypattern.carfactory;
/**新建抽象工厂接口的高级车adv工厂实现类*/
public class Car_factory_adv implements Icar_factory {

	@Override
	public Icar_interface create_threeW_car() {
		Car_3W_impl_adv car_3W_impl_adv = new Car_3W_impl_adv();
		car_3W_impl_adv.setName("大众A6");
		car_3W_impl_adv.setSpeed(300);
		return car_3W_impl_adv;
	}

	@Override
	public Icar_interface create_audi_car() {
		Car_audi_impl_adv car_audi_impl_adv = new Car_audi_impl_adv();
		car_audi_impl_adv.setName("奥迪A6");
		car_audi_impl_adv.setSpeed(300);
		return car_audi_impl_adv;
	}

}
