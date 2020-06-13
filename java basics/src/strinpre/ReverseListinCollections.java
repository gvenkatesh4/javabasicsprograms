package strinpre;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class ReverseListinCollections {
	
	public static void main(String[] args) {
		
		
		List<Integer>list = new ArrayList<>();
		
		list.add(50);
		list.add(20);
		list.add(30);
		list.add(100);
		
		Collections.reverse(list);
		
		
		/*for(Integer a:list) {
			System.out.println(a);
		}*/
		Comparator cmp = Collections.reverseOrder();
		Collections.sort(list,cmp);
		System.out.println(list);
		System.out.println("----------");
		Iterator t = list.iterator();
		while(t.hasNext()) {
			System.out.println(t.next());
		}
		
				//System.out.println(list.hashCode());
	}

}
