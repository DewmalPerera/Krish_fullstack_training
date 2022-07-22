package Template;

public abstract class Beverage {
	
	final void prepareRecepie() {
		boilWater();
		brew();
		addCondiments();
		pourInCup();
	}
	
	void boilWater() {
		System.out.println("Boiling water ..");
	}
	
	abstract void brew();
	
	abstract void addCondiments();
	
	void pourInCup() {
		System.out.println("Pour Into Cup ..");
	}

}
