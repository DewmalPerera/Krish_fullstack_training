package lamda_Example.Regular.Example2;

class Iphone implements Phone{
	public String getPhoneName(String name) {
		return name;
	}
}

public class Regular {
	 public static void main(String[] args){

	       Iphone p = new Iphone();
	       System.out.print(p.getPhoneName("IPhone X"));
	       
	 }
}
