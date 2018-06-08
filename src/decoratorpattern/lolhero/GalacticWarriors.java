package decoratorpattern.lolhero;

public class GalacticWarriors extends HeroDecorator {

	private Hero hero ;
	
	public GalacticWarriors(Hero hero) {
		super(hero);
	}
	@Override
	public void init() {
		super.init();
		setSkin();
	}

	private void setSkin() {
		System.out.println("皮肤：银河战士套装");
		
	}

	
}
