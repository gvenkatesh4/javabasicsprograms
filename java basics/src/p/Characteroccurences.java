package p;

import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

public class Characteroccurences {
	
	public static void main(String[]args) {
		
		String str="talentsprint";
		
		
		Map<Character,Integer>countwordsfreqency=new TreeMap<>();
		
		
		for(Character c:str.toCharArray()) {
			
			
			if(countwordsfreqency.containsKey(c)) {
				countwordsfreqency.put(c,countwordsfreqency.get(c)+1);
			}
			else
			{
				
				countwordsfreqency.put(c,1);
			}
		}
		
		//for(Map.Entry<Character, Integer>d:countwordsfreqency.entrySet()) {
			//System.out.println(d);
		//}
		System.out.println(countwordsfreqency);
	}

}
