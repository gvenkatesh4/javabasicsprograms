package p;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class Hashsetusingiterator {
	public static void main(String[] args) {
		
		HashSet<String>hashset = new HashSet<String>();
		hashset.add("apple");
		hashset.add("apple");

		hashset.add("samsung");
		hashset.add("oneplus");
		hashset.add("ios");
		hashset.add("android");

		Iterator<String>it = hashset.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("-----------------");
		
		for( String abc:hashset) {
			System.out.println(abc);
		}
		
		if(hashset.contains("apple")) {
			System.out.println("yes");
			}
			else
				System.out.println("no");
		
			
			
           		}
	}


