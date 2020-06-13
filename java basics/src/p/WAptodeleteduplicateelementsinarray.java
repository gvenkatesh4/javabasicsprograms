package p;

import java.util.ArrayList;
import java.util.HashSet;

public class WAptodeleteduplicateelementsinarray {
	
	public static void main(String[] args) {
		
	ArrayList<Integer>ab = new ArrayList<Integer>();
	ab.add(10);
	ab.add(10);
	ab.add(20);
	
	
	HashSet<Integer>aa=new HashSet<Integer>(ab);
	
	
	for(Integer aaa:aa) {
		System.out.println(aaa);
	}
	
		
		
	}

}
