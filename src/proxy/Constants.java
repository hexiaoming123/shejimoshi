package proxy;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 * 常量类可通过import static导入，个人更喜欢把常量类和Utils工具类放在一块，
 * 都可以通过import static导入，然而，常量类也有一些缺陷，在编译时如果修改了常量类，
 * 编译时依赖常量类的其他类文件并不重新编译，所以在开发过程中，修改常量类后尽量先对项目进行clean，
 * 然后build，这也是不建议使用接口定义常量类的主要原因，
 * 调用接口的客户API不可能在接口重新发布时都进行编译。
*类描述：
*@author: Administrator
*@date: 日期:2018年5月24日 时间:下午4:59:26
*@version 1.0
 */
public class Constants {
		public static final String USER_HOME = "user.home";  
	    public static final String USER_DIR = "user.dir";  
	    public static final String OS_NAME = "os.name";  
	    private Constants(){}  
	      
	    public static String[] values() {  
	        Field[] fields = Constants.class.getFields();  
	        String[] s = new String[fields.length];  
	        for(int i=0,n=fields.length; i<n; i++) {  
	            try {  
	                Field f = fields[i];  
	                s[i] = (String) f.get(null);  
	            } catch (Exception ex) {  
	                Logger.getLogger(Constants.class.getName()).log(Level.SEVERE, null, ex);  
	            }  
	        }  
	        return s;  
	    }  
	      
	    public static Set<String> asSet() {  
	        return new HashSet<String>(Arrays.asList(values()));  
	    }  
	      
	    public static void main(String[] args) {  
	        System.out.println("values="+Arrays.asList(values()));  
	        System.out.println("set="+asSet());  
	    }  
	}  
