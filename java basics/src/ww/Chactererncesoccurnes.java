package ww;

import java.util.HashMap;
import java.util.Map;

public class Chactererncesoccurnes {
	
	public static void main(String[] args0) {
		
		
		String str = "talentsprint";
		
		Map<Character,Integer> countmap = new HashMap<Character,Integer>();
		
		for(Character c :str.toCharArray()) {
			
			
			if(countmap.containsKey(c)) {
				
				countmap.put(c, countmap.get(c)+1);
			}
			else
			{
				countmap.put(c, 1);
			}
			
		}
		System.out.println(countmap);
	}

}
