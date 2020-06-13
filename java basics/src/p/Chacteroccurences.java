package p;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class Chacteroccurences {
	
	public static void main(String[]args) {
		
		
		String str  = "jjava";
		
		
		Map<Character,Integer>countmap =  new HashMap<>();
		
		
		for(Character c:str.toCharArray()) {
			
			
			if(countmap.containsKey(c)) {
				countmap.put(c,countmap.get(c)+1);
			}
			else
			{
				countmap.put(c,1);
			}
		}
		for(Entry<Character, Integer> d:countmap.entrySet())
		 {
				System.out.println(d);
			
		
		
		//System.out.println(countmap);
	}

}
}
