package mediatorpattern;
/**
 * 
*类描述：媒人类-------中介者
*@author: Administrator
*@date: 日期:2018年5月24日 时间:下午2:48:42
*@version 1.0
 */
public class Matchmaker {

	private Mans man;//男人
	private Woman woman;//女人 
	private ManParent manp;//男方父母
	private WomanParent womanp;//女方父女
	
	Matchmaker(){
		
	}
	
	/**
	 * 媒人处理男人提出的约会，
	 * 男人提出约会则需要把该问题告诉媒人
	 * 由媒人去和女人，女方家长，男方家长交互
	*@date: 日期:2018年5月24日 时间:下午2:52:33
	 */
	public void doManTryst(String says) {
		System.out.println(" 媒人开始处理约会问题开始");
		woman.thinking(says);
		manp.thinking(says);
		womanp.thinking(says);
		System.out.println(" 媒人处理约会问题结束，根据同意的结果做其他处理");
	}

	
	/**
	 * 媒人处理女人提出的约会，
	 * 女人提出约会则需要把该问题告诉媒人
	 * 由媒人去和男人，女方家长，男方家长交互
	*@date: 日期:2018年5月24日 时间:下午2:52:33
	 */
	public void doWomanTryst(String says) {
		System.out.println(" 媒人开始处理约会问题开始");
		man.thinking(says);
		manp.thinking(says);
		womanp.thinking(says);
		System.out.println(" 媒人处理约会问题结束，根据同意的结果做其他处理");
	}
	/**
	 * 处理彩礼等其他问题
	* @param man 
	* @return
	* @throws
	 */
	public void doOther(String says){
		System.out.println("处理其他问题");
		man.thinking(says);
		woman.thinking(says);
		manp.thinking(says);
		womanp.thinking(says);
	}
	//以下四个注册方法，可以理解为，南方和女方之间的通讯必须通过媒人
	/**
	 * 注册男人
	* @param man 
	* @return
	* @throws
	 */
	public void registeMan(Mans man) {
		this.man = man;
	}
	/**
	 * 注册男方家长
	* @param manp 
	* @return
	* @throws
	 */
	public void registeManParent(ManParent manParent) {
		this.manp = manParent;
	}
	/**
	 * 注册女人
	* @param woman 
	* @return
	* @throws
	 */
	public void registeWoman(Woman woman) {
		this.woman = woman;
	}
	/**
	 * 注册女方家长
	* @param womanp 
	* @return
	* @throws
	 */
	public void registeWomanParent(WomanParent womanParent) {
		this.womanp = womanParent;
	}
}
