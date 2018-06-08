package chainofresponsibilitypattern;
/**
 * 
* @ClassName: ConsoleLogger 
* @Description: TODO(创建扩展了该记录器类的实体类。) 
* @author A18ccms a18ccms_gmail_com 
* @date 2018年6月8日 下午4:18:26 
*
 */
public class ConsoleLogger extends AbstractLogger {

	   public ConsoleLogger(int level){
	      this.level = level;
	   }

	   @Override
	   protected void write(String message) {        
	      System.out.println("Standard Console::Logger: " + message);
	   }
	}
