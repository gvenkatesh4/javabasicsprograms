package cocubesprograms;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Sortingarraylistindesccindingorderincollections {

	public static void main(String[] args) {
		ArrayList<String>data = new ArrayList<String>();
		data.add("amazon");
		data.add("bflipcart");
		data.add("cber");
		data.add("dracle");
		data.add("eloudelements");
		System.out.println("before sorting");
		for(String a:data) {
			System.out.println(a);
		}
		System.out.println("after sorting");
		Collections.sort(data,Collections.reverseOrder());
		
		for(String a:data) {
			System.out.println(a);
		}
		
	}

}
