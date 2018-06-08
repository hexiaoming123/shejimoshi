package publisherorsubjecriber;

import java.util.Observer;
/**
 * 
*类描述: 观察者模式测试类
*@author: Administrator
*@date: 日期:2018年5月24日 时间:下午3:39:14
*@version 1.0
 */
public class StateMain {   
    public static void main(String[] args) {   
  
        Saiya saiya = new Saiya();   
        Observer athena = new Athena();   
        saiya.addObserver(athena);   
        System.out.println("星矢最初的状态是：" + saiya.status());   
        for (int i = 0; i < 5; i++) {   
            System.out.println("星矢被揍了" + (i + 1) + "次");   
            saiya.hit();   
            System.out.println("星矢现在的状态是：" + saiya.status());   
        }   
    }   
}  
