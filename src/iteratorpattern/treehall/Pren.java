package iteratorpattern.treehall;

public class Pren {

	public static void main(String[] args) {
		Hall hall = new Hall(4);
		hall.add(new Tree("苹果树"));
		hall.add(new Tree("梨树"));
		hall.add(new Tree("橘子树"));
		hall.add(new Tree("香蕉树"));
		//i.hasNext()第一次判断Hall中存放的Tree数组是否为空，然后判断下一个，一直到最后一个
		for (Iterator i = hall.connectIterator();i.hasNext();) {
			//第一次取出Hall中存放的Tree数组下标为0的元素，
			//然后下标加一，最后一个下标加一会超出下标，到hasNext方法中会退出
			String Type = ((Tree) i.next()).getName();
			if (Type =="梨树") {
				System.out.println("撒梨树农药");
			}
			if (Type =="苹果树") {
				System.out.println("撒苹果树农药");
			}
			if (Type =="橘子树") {
				System.out.println("撒橘子树农药");
			}
			if (Type =="香蕉树") {
				System.out.println("撒香蕉树农药");
			}
		}
	}
}
