package factorypattern;

public class 足球协会 implements 体育协会 {

	@Override
	public 运动员 注册() {
	return new 足球运动员();
	}

}
