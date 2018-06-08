package strategypattern;

/**
 * 策略模式中分成三种角色 抽象策略角色：通常用一个抽象类或者接口实现，主要定义这个算法所完成的功能。 具体策略角色:包装了相关算法和行为。
 * 环境角色：持有策略类的应用
 * 
 * @ClassName: Client
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author A18ccms a18ccms_gmail_com
 * @date 2018年6月5日 上午9:54:56
 *
 */
public class Client {
/**sql中如果插入带'的数据会错误，这个转义下*/
	public static void main(String[] args) {
		String s = "{id'osd}";
		if (s.contains("'")) {
			// 拿到id字段是处于字符串第几个位置
			int start = s.indexOf("'");
			StringBuffer  sbf =new StringBuffer();
			String a = s.substring(0, start);
			String b = "\\";
			String c = s.substring(start);
			sbf.append(a).append(b).append(c);
			System.out.println(sbf.toString());
		}
	}
}
