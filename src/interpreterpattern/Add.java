package interpreterpattern;
//https://blog.csdn.net/jingzi123456789/article/details/71515728

//非终结符表达式角色  

class Add extends Expression  

{  

     private Expression left ,right ;  

     public Add(Expression left , Expression right)  

     {  

            this.left = left ;  

            this.right= right ;  

     }  

     public int interpret(Context con)  

     {  

            return left.interpret(con) + right.interpret(con);  

     }  

}  
