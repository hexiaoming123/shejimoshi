package proxy;

public class MyForumProxy implements MyForum {

	private RealMyForum forum;
	private int permission;//权限值
	
	public MyForumProxy(int permission){
		forum = new RealMyForum();
		this.permission = permission;
	}
	//实现的接口
	@Override
	public void AddFile() {
		//满足权限的时候才能执行
		//Constants是一个常量类
		if (EnumApp.MON.getValue() == permission) {
			forum.AddFile();
		}else{
			System.out.println(" You are not a associator of MyForum , please registe!");
		}
	}
}
