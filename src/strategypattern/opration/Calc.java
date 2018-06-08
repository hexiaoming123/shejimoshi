package strategypattern.opration;
/**
 * 
* @ClassName: Client 
* @Description: TODO(环境类) 
* @author A18ccms a18ccms_gmail_com 
* @date 2018年6月5日 上午10:08:34 
*
 */
public class Calc {

	public final static Add add = new Add();
	public final static Sub sub = new Sub();
	public final static Div div = new Div();
	public final static Multi multi = new Multi();
	
}
