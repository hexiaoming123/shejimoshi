package bridgepattern;
/**创建实现了 Shape 接口的实体类。*/
public class Circle extends Shape {
	   private int x, y, radius;
	 //Implicit super constructor Shape() is undefined. Must explicitly invoke another constructor
	   public Circle(int x, int y, int radius, DrawAPI drawAPI) {
	      super(drawAPI);//这行不写会报错
	      this.x = x;  
	      this.y = y;  
	      this.radius = radius;
	   }

	   public void draw() {
	      this.drawAPI.drawCircle(radius,x,y);
	   }
	}
