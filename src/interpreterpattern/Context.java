package interpreterpattern;

import java.util.HashMap;
import java.util.Map;
//上下文（环境）角色，使用HashMap来存储变量对应的数值  

class Context  

{  

     private Map valueMap = new HashMap();  

     public void addValue(Variable x , int y)  

     {  

            Integer yi = new Integer(y);  

            valueMap.put(x , yi);  

     }  

     public int LookupValue(Variable x)  

     {  

            int i = ((Integer)valueMap.get(x)).intValue();  

            return i ;  

     }  

}  