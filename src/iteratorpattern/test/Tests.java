package iteratorpattern.test;

public class Tests {

	public static void main(String[] args) {
		Test test = new Test();
		Thread t1 = new Thread(new Test1Thread(test));
		Thread t2 = new Thread(new Test2Thread(test));
		t1.start();
		t2.start();
	}
}
