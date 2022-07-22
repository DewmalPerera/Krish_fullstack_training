package Template;

public class Tea extends Beverage{

	@Override
	void brew() {
		System.out.println("Steeping the Tea ...");		
	}

	@Override
	void addCondiments() {
		System.out.println("Adding lemon ...");				
	}

}
