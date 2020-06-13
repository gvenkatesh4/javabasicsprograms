package p;

import java.util.Map;
import java.util.TreeMap;

public class Chaocc {
	public static void main(String[] args) {
		

		String str = "hanuman";
		
		Map<Character,Integer>countcha = new TreeMap();
		
		for(Character cha :str.toCharArray()) {
		
			if(countcha.containsKey(cha)) {
				countcha.put(cha, (countcha.get(cha)+1));
			}
			else {
				countcha.put(cha,1);
			}
			
			
			
			
		}	
		System.out.println(countcha);

			
		}
		}