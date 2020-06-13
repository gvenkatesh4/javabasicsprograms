package extrapracice;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Everyelerepeatedtwiceexceptone {
	
	public static void main(String[]args) {
		
		
		int a [] = {1,2,2,3,4,4,5,5};
		
		
		HashMap<Integer, Integer>countmap = new HashMap<Integer, Integer>();
		
		for(int i =0;i<a.length;i++) {
			if(countmap.containsKey(a[i])){
				countmap.put(a[i], countmap.get(a[i])+1);
				
			}
			else
			{
				countmap.put(a[i],1);
			}
		}
		
Set<Integer>setk = countmap.keySet();

Iterator<Integer>iterator = setk.iterator();
while(iterator.hasNext()) {
	int key = iterator.next();
	if(countmap.get(key)==1) {
		System.out.println(key);
	}
}

		System.out.println(countmap);
	}

}
