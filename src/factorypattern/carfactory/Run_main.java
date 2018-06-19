package factorypattern.carfactory;

public class Run_main {

	public static void main(String[] args) {
		Icar_factory icar_factory_ref = new Car_factory_adv();
		Icar_interface icar_interface_ref = icar_factory_ref.create_threeW_car();
		icar_interface_ref.start();
		icar_interface_ref.stop();
	}
}
