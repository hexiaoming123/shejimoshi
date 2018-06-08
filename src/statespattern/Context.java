package statespattern;
/**
 * 
* @ClassName: Context 
* @Description: TODO 环境角色类 
* @author A18ccms a18ccms_gmail_com 
* @date 2018年5月30日 下午4:37:40 
*
 */
public class Context {
	//持有一个State对象的实例
	private State state;
	public void setState(State state){
		this.state = state;
	}
	/**
	 * 用户感兴趣的方法
	 */
	public void request (String sampleParameter){
		//转调state处理
		state.handle(sampleParameter);
	}
}
