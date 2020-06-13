package ww;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Reverseanarraylistinjava {
	
	public static void main(String[]args) {
		
		List<Integer>a = new ArrayList<Integer>();
		a.add(10);
		a.add(20);
		a.add(30);
		a.add(40);
		a.add(40);
		a.add(50);
		a.add(60);
		a.add(70);
		a.add(80);
		a.add(90);
		a.add(100);
		Collections.reverse(a);
		


		System.out.println(a);
	}

}
