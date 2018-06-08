package decoratorpattern.lolhero;

public abstract class HeroDecorator implements Hero {

	private Hero hero ;
	
	public HeroDecorator(Hero hero) {
		super();
		this.hero = hero;
	}

	@Override
	public void init() {
		hero.init();
	}

	
}
