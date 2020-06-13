package ww;

import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeSet;

public class Collectionexample {

	public static void main(String[]args) {
		
		
		ArrayList<Integer>a = new ArrayList<Integer>();
		a.add(5);
		a.add(10);
		a.add(15);
		a.add(20);
		a.add(250);
		
		Collections.sort(a);
		
		System.out.println(a);
		
		Collections.reverse(a);
		
		System.out.println(a);
		
		
		TreeSet<Integer>ab = new TreeSet<Integer>();
		ab.add(5);
		ab.add(10);
		ab.add(15);
		ab.add(20);
		ab.add(250);
		
		System.out.println(ab.first());
		
		
		System.out.println(ab.last());
		
		
		
		
}
	
}
