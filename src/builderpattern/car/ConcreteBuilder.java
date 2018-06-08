package builderpattern.car;

public class ConcreteBuilder implements Builder {

	Part partA,partB,partC;
	@Override
	public void buildPartA() {
		// 这里具体如何构架partA的代码
	};

	@Override
	public void buildPartB() {
		// 这里具体如何构架partB的代码

	};

	@Override
	public void buildPartC() {
		// 这里具体如何构架partC的代码

	};

	@Override
	public Product getResult() {
		// 返回最后组装成品结果
		return null;
	};

}

