package lamda_Example.Regular.Example1;


class Desk implements Rectangle{
		public int Area(int w, int h) {
			return w*h;	
		}
		
	}

public class Regular {
	
	public static void main(String[] args) {
		 	Desk d = new Desk();
	        int desk = d.Area(10, 5); 
	        System.out.println(desk);

	}

}
