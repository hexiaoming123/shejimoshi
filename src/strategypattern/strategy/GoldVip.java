package strategypattern.strategy;
/**
 * 策略方法实现类配合注解
 * */
@PriceRegion(min=10000,max=15000)
public class GoldVip implements CalPrice {

	@Override
    public Double calPrice(Double orgnicPrice) {
        return orgnicPrice * 0.7;
    }

}