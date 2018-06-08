package iteratorpattern.test;

public class Test2Thread implements Runnable{

	private Test test;
	
	public Test2Thread(Test test) {
		this.test = test;
	}

	@Override
	public void run() {
		test.read();
	}

}
