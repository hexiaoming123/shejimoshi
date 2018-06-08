package iteratorpattern.test;

public class Test1Thread implements Runnable {

	private Test test;
	public Test1Thread(Test test) {
		this.test = test;
	}

	@Override
	public void run() {
		test.add();
	}

}
