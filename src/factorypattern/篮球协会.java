package factorypattern;

public class 篮球协会 implements 体育协会 {

	@Override
	public 运动员 注册() {
		return new 篮球运动员();
	}

}
