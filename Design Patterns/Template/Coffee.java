package Template;

public class Coffee extends Beverage{

	@Override
	void brew() {
		System.out.println("Striping coffee through a filter ...");		
	}

	@Override
	void addCondiments() {
		System.out.println("Adding sugar and lemon ...");				
	}

}

