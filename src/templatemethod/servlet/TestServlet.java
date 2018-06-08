package templatemethod.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 * HttpServlet担任抽象模板角色

　　　　模板方法：由service()方法担任。

　　　　基本方法：由doPost()、doGet()等方法担任。

　　TestServlet担任具体模板角色

　　　　TestServlet置换掉了父类HttpServlet中七个基本方法中的其中两个，分别是doGet()和doPost()。
* @ClassName: TestServlet 
* @Description: TODO(这里用一句话描述这个类的作用) 
* @author A18ccms a18ccms_gmail_com 
* @date 2018年6月4日 下午4:27:55 
*
 */
public class TestServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        System.out.println("using the GET method");

    }

    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            
        System.out.println("using the POST method");
    }

}