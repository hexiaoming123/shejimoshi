package strategypattern.strategy;
/**
 * 策略方法实现类配合注解
 * */
@PriceRegion(min=15000,max=20000)
public class Vip implements CalPrice {

	@Override
    public Double calPrice(Double orgnicPrice) {
        return orgnicPrice * 0.9;
    }
}