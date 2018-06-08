package facadepattern;

/**
 * 
* @ClassName: FacadePatternDemo 
* @Description: TODO(使用该外观类画出各种类型的形状。) 
* @author A18ccms a18ccms_gmail_com 
* @date 2018年6月8日 下午12:41:48 
*
 */
public class FacadePatternDemo {
   public static void main(String[] args) {
      ShapeMaker shapeMaker = new ShapeMaker();

      shapeMaker.drawCircle();
      shapeMaker.drawRectangle();
      shapeMaker.drawSquare();        
   }
}