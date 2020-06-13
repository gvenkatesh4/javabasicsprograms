package zarraysprep;

import java.util.TreeSet;

public class Separtingzerosinthearray {
	
	public static void main(String[]args) {
		
		
		int a[] = {1,0,1,2,5,0};
		
		TreeSet<Integer>adddatanum = new TreeSet<Integer>();
		
		TreeSet<Integer>numbers = new TreeSet<Integer>();
		
		for(int i = 0;i<a.length;i++) {
			if(a[i]==0) {
				adddatanum.add(a[i]);
			}
			else {
				numbers.add(a[i]);
			}
		}
		System.out.println(numbers+" "+adddatanum);
		
	}

}
