package strategypattern.strategy;
/**
 * 策略方法接口类
 * 
 */
public interface CalPrice {
	/**
     * 策略方法
     * 根据原价返回一个最终的价格
     */
    Double calPrice(Double orgnicPrice);
}
