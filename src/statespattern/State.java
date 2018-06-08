package statespattern;
/**
 * 
* @ClassName: State 
* @Description: TODO 抽象状态接口
* @author A18ccms a18ccms_gmail_com 
* @date 2018年5月30日 下午4:38:46 
*
 */
public interface State {
/**
 * 
* @Title: handle 
* @Description: TODO 状态对应的处理 
* @param @param sampleParameter    设定文件 
* @return void    返回类型 
* @throws
 */
	public void handle(String sampleParameter);
}
