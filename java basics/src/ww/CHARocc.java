package ww;

import java.util.Map;
import java.util.TreeMap;

public class CHARocc {

	public static void main(String[]args) {
		
		String str = "java";
		
		
		Map<Character,Integer>obj = new TreeMap<Character,Integer>();
		
		
		for(Character c:str.toCharArray()) {
			if(obj.containsKey(c)) {
				obj.put(c, obj.get(c)+1);
			}
			else
			{
				obj.put(c, 1);
			}
		}
		System.out.println(obj);
	}
}
