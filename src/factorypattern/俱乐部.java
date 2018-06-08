package factorypattern;

public class 俱乐部 {

	private 运动员 守门员;
	private 运动员 后卫;
	private 运动员 前锋;
	public void test(){
		体育协会 中国足协 = new 足球协会();
		this.前锋 = 中国足协.注册();
		this.后卫 = 中国足协.注册();
		this.守门员 = 中国足协.注册();
		守门员.跑();
		后卫.跳();
	}
}
