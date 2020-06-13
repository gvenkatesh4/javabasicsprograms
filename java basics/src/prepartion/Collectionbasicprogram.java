package prepartion;

import java.util.ArrayList;
import java.util.Iterator;


public class Collectionbasicprogram {
	
	public static void main(String[] args) {
		
		
		
		ArrayList<Integer>arr = new ArrayList<Integer>();
		arr.add(1);
		arr.add(2);
		arr.add(3);
		arr.add(4);
	    arr.add(5);
		arr.add(6);
		
		
		for(Integer a:arr) {
			System.out.println(a);
		}
		System.out.println("-------------");
		Iterator ad = arr.iterator();
		while(ad.hasNext()){
			System.out.println(ad.next());
		}
		
	}

}
