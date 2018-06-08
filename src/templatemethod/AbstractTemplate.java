package templatemethod;
/**
 * 抽象模板角色类
* @ClassName: AbstractTemplate 
* @Description: TODO(这里用一句话描述这个类的作用) 
* @author A18ccms a18ccms_gmail_com 
* @date 2018年6月4日 下午3:32:47 
*
 */
public abstract class AbstractTemplate {
	/**
	 * 模板方法
	* @Title: templateMethod 
	* @Description: TODO(这里用一句话描述这个方法的作用) 
	* @param     设定文件 
	* @return void    返回类型 
	* @throws
	 */
	public void templateMethod(){
		//调用基本方法
		abstractMethod();
		hookMethod();
		concreteMethod();
	}
	/**
	 * 基本方法的声明(由子类实现)
	 */
	protected abstract void abstractMethod();
	/**
	 *基本方法（空方法） 
	 */
	protected void hookMethod(){};
	/**
	 * 基本方法（已经实现）
	 */
	private final void concreteMethod(){
		//业务相关代码
	};
}
