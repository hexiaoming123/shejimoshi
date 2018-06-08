package decoratorpattern.lolhero;

public class DecoratorPatternDemo {

	public static void main(String[] args) {
		Hero hero = new Victor();
		HeroDecorator herodecorator = new GalacticWarriors(hero); 
		herodecorator.init();
	}
}
