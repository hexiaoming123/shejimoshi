package publisherorsubjecriber;

import java.util.Observable;
/**被观察对象:地球*/
public class Earch extends Observable {

	private String weather ="晴朗";

	public String getWeather() {
		return weather;
	}
	public void setWeather(String weather) {
		this.weather = weather;
		//设置变化点
		setChanged();
		notifyObservers(weather);
	}
}
