package interpreterpattern;
/**抽象表达式角色，也可以用接口来实现  */
abstract class Expression {
	public abstract int interpret(Context con);
}
