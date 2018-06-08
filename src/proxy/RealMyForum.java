package proxy;

public class RealMyForum implements MyForum{

	@Override
	public void AddFile() {
		System.out.println("From real MyForum");
		
	}
}
