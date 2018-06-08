package publisherorsubjecriber;

import java.util.Observable;
import java.util.Observer;
/**观察对象:气象卫星*/
public class Satellite implements Observer{
	private String weather;
	
	@Override
	public void update(Observable o, Object arg) {
		weather = (String) arg;
		//捕获天气变化，反馈给检测者
		System.out.println("近期变化:"+weather);
	}
}
