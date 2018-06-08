package mediatorpattern;

/**
 * 
*类描述：女方家长类
*@author: Administrator
*@date: 日期:2018年5月24日 时间:下午2:36:19
*@version 1.0
 */
public class WomanParent {

	private Matchmaker mat;//媒人类

	public WomanParent(Matchmaker mat) {
		this.mat = mat;
		mat.registeWomanParent(this);//把自己在媒人哪里注册（声明）
	}
	/**
	* @param 
	* @return 考虑是否同意
	* @throws 
	*@date: 日期:2018年5月24日 时间:下午2:27:22
	 */
	public boolean thinking(String says){
		boolean flag =false;
		System.out.println("女方父母考虑我们该不该同意呢？？？");
		if (says.length()>5) {
			System.out.println("我们同意了");
			flag = true;
		}else{
		System.out.println("我们不同意");
		}
		return flag;
	}
}
