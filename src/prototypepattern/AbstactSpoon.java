package prototypepattern;
/**勺子抽象类*/
public abstract class AbstactSpoon implements Cloneable {
	String spoonName;

	public String getSpoonName() {
		return spoonName;
	}

	public void setSpoonName(String spoonName) {
		this.spoonName = spoonName;
	}
	public Object clone(){
		Object object = null;
		try {
			object = super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
			System.out.println("AbstactSpoon is not Cloneable");
		}
		return object;
	}
}
