package lamda_Example.Lamda.Example1;

import lamda_Example.Regular.Example1.Rectangle;

public class AreaLamda {
	public static void main(String[] args) {
		Rectangle r = (int w, int h) -> w * h;
        System.out.print(r.Area(10, 5));
	}

}
