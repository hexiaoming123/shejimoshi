package prototypepattern;

import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
/** 
 * 客户端调用 
 * 
 */  
public class Client {
public static void main (String[] args) throws ClassNotFoundException, IOException {
	  Resume a = new Resume("大鸟");  
      a.setPersonalInfo("男", 29);  
      a.setWorkExperience("1998-2000", "xx公司");  
      //浅复制  
      Resume b = (Resume)a.clone();  
      b.setWorkExperience("1998-2006", "yy公司");  
      b.setPersonalInfo("男", 25);  
        
      a.display();  
      b.display();  
//    运行结果：a和b的WorkExperience的引用值是一样的  
//    大鸟 男 29  
//    工作经历：1998-2006 yy公司  
//    大鸟 男 25  
//    工作经历：1998-2006 yy公司  
       
      Resume c = new Resume("大鸟");  
      c.setPersonalInfo("男", 29);  
      c.setWorkExperience("1998-2000", "xx公司");  
      //深复制  
      Resume d = (Resume)c.deepClone();  
      d.setWorkExperience("1998-2006", "yy公司");  
      d.setPersonalInfo("男", 25);  
                    
      c.display();  
      d.display();  
//    运行结果：a和b的WorkExperience的引用值是不同的  
//    大鸟 男 29  
//    工作经历：1998-2000 xx公司  
//    大鸟 男 25  
//    工作经历：1998-2006 yy公司  
	
	}
}
