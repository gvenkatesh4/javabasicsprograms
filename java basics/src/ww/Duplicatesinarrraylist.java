package ww;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

public class Duplicatesinarrraylist {
	public static void main(String[] args) {
		
		
		List<Integer> a = new ArrayList<Integer>();
		a.add(10);
		a.add(50);
		a.add(80);
		a.add(100);
		a.add(10);
		
		
		HashSet<Integer> ab = new HashSet<Integer>(a);
		
		for(Integer c :ab) {
			System.out.println(Collections.frequency(a, c)+"="+c);
		}
	}

}
