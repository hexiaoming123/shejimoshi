package compositepattern;

import java.util.ArrayList;
import java.util.List;

/**
 * 
* @ClassName: Employee 
* @Description: TODO(创建 Employee 类，该类带有 Employee 对象的列表。) 
* @author A18ccms a18ccms_gmail_com 
* @date 2018年6月8日 下午12:48:06 
*
 */
public class Employee {
   private String name;
   private String dept;
   private int salary;
   private List<Employee> subordinates;

   //构造函数
   public Employee(String name,String dept, int sal) {
      this.name = name;
      this.dept = dept;
      this.salary = sal;
      subordinates = new ArrayList<Employee>();
   }

   public void add(Employee e) {
      subordinates.add(e);
   }

   public void remove(Employee e) {
      subordinates.remove(e);
   }

   public List<Employee> getSubordinates(){
     return subordinates;
   }

   public String toString(){
      return ("Employee :[ Name : "+ name 
      +", dept : "+ dept + ", salary :"
      + salary+" ]");
   }   
}
