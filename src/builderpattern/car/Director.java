package builderpattern.car;

public class Director {
	private Builder builder;
	public Director(Builder builder) {
		this.builder = builder;
	}
	//将部件partA partB partC 最后组装成复杂的对象
	//这里是将车轮 方向盘，发动机 组装成汽车的过程
	public void construct(){
		builder.buildPartA();
		builder.buildPartB();
		builder.buildPartC();
	}
}
