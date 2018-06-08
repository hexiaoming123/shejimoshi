package strategypattern.strategy;
/**
 * 策略方法实现类配合注解
 * */
@PriceRegion(min=0,max = 10000)
public class Orgnic implements CalPrice {

	@Override
    public Double calPrice(Double orgnicPrice) {
        return orgnicPrice;
    }
}
