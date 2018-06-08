package publisherorsubjecriber;

/**
 * 客户端调用:气象局----观察者模式
*类描述：
*@author: Administrator
*@date: 日期:2018年5月24日 时间:下午3:37:05
*@version 1.0
 */
public class WeatherService {

	public static void main(String[] args) {
		Earch earch =new Earch();
		Satellite satellite = new Satellite();
		//发射气象卫星
		earch.addObserver(satellite);
		System.out.println(" 天气预报  ");
		System.out.println("---------------");
		earch.setWeather(" 台风 '珍珠' 逼近");
		earch.setWeather(" 大到暴雨   ");
		earch.setWeather(" 天气炎热 ");
	}
}
