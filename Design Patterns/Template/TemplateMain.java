package Template;

public class TemplateMain {
	
	static Beverage beverage = null;

	public static void main(String[] args) {
		
		System.out.println("== Tea ==");
		Beverage tea = new Tea();
		tea.prepareRecepie();
		
		System.out.println("\n== Coffee ==");
		Beverage coffee = new Coffee();
		coffee.prepareRecepie();
	}

}
