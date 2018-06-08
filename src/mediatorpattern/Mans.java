package mediatorpattern;
/**
 * 
*类描述：
*@author: Administrator
*@date: 日期:2018年5月24日 时间:下午2:11:41
*@version 1.0
 */
public class Mans {
	private Matchmaker mat;//媒人

	public Mans(Matchmaker mat) {
		this.mat = mat;
		mat.registeMan(this);//把自己在媒人哪里注册（声明）
	} 
	
	/**
	* @param 
	* @return 考虑是否同意
	* @throws 
	*@date: 日期:2018年5月24日 时间:下午2:27:22
	 */
	public boolean thinking(String says){
		boolean flag =false;
		System.out.println("男人考虑我该不该同意呢？？？");
		if (says.length()>5) {
			System.out.println("我同意了");
			flag = true;
		}else{
		System.out.println("我不同意");
		}
		return flag;
	}
	/**
	 * 提出约会
	 * 男人提出约会，只需要告诉媒人，由媒人负责跟其他人交互
	 * @param says
	 */
	public void tryst(String says){
		System.out.println("男人提出约会，说："+says);
		mat.doManTryst(says);
	}
}
