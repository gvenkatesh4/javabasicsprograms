package zarraysprep;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Highestfrequencyelementinthearry {

	public static void main(String[]args) {
		
		
		int a[] = {10,20,10,10,10,20};
		
		int frequency = 0;
		HashMap<Integer,Integer>count=new HashMap<Integer,Integer>();
		
		for(Integer num:a) {
			if(count.containsKey(num)) {
				count.put(num, count.get(num)+1);
			}
			else {
				count.put(num,1);
			}
		}
	}
	
}

