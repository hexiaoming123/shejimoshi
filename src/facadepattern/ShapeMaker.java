package facadepattern;

/**
 * 
* @ClassName: ShapeMaker 
* @Description: TODO(创建外观类) 
* @author A18ccms a18ccms_gmail_com 
* @date 2018年6月8日 下午12:40:49 
*
 */
public class ShapeMaker {
	   private Shape circle;
	   private Shape rectangle;
	   private Shape square;

	   public ShapeMaker() {
	      circle = new Circle();
	      rectangle = new Rectangle();
	      square = new Square();
	   }

	   public void drawCircle(){
	      circle.draw();
	   }
	   public void drawRectangle(){
	      rectangle.draw();
	   }
	   public void drawSquare(){
	      square.draw();
	   }
	}