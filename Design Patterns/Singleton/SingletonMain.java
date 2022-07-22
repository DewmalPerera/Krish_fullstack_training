package Singleton;

public class SingletonMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Singleton singleton = Singleton.getInstance();
		System.out.println(singleton);
		
		Singleton singleton1 = Singleton.getInstance();
		System.out.println(singleton1);
		
	}

}


