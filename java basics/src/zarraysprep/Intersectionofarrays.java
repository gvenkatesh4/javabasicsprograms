package zarraysprep;

import java.util.HashSet;

public class Intersectionofarrays {

	
	public static void main(String[]args) {
		
		
		String str [] = {"java","talent","sprint"};
		String str1[] = {"java","sprint","talent","psr"};
		
		HashSet<String>setdata = new HashSet<String>();
		
		for(int i =0;i<str.length;i++) {
			
			for(int j = 0;j<str1.length;j++) {
				if(str[i].equals(str1[j])) {
					setdata.add(str[i]);
				}
			}
		}
		System.out.println(setdata);
	}
}
