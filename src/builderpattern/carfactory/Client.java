package builderpattern.carfactory;

public class Client {

	public static void main(String[] args) {
		BenzBuilder builder = new BenzBuilder();
		Producer director = new Producer(builder);
		director.Construct();
		Car car = builder.GetCar();
		car.ShowMe();
	}
	
}
