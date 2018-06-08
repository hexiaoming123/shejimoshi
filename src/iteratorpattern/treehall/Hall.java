package iteratorpattern.treehall;

public class Hall {

	Tree [] tree;//这里可以看做是聚合关系
	private int index;//指向Tree []的标签
	public Hall( int maxindex) {
		tree = new Tree [maxindex];
		index = 0;
	}
	public void add(Tree tree){
		this.tree[index] =tree;
		index++;
	}
	public Iterator connectIterator(){
		return new TreeIterator(this);
	}
}
