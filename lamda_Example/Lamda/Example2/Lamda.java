package lamda_Example.Lamda.Example2;

import lamda_Example.Regular.Example2.Phone;

public class Lamda {

	public static void main(String[] args) {
		Phone p = name -> "Iphone X";
		System.out.print(p.getPhoneName(""));
	}

}
