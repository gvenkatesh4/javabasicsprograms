package p;

import java.util.ArrayList;
import java.util.Collections;

public class Collectonssorting {
	public static void main(String[] args) {
		
		ArrayList<String>arr = new ArrayList<String>();
		
		arr.add("hyd");
		arr.add("newqork");
		arr.add("usa");
		arr.add("kansas");
		arr.add("california");
		arr.add("swizzerland");
		for(String sortt:arr) {
			System.out.println(sortt);

		}
		System.out.println("---------------");
		
		Collections.reverse(arr);
		
		
		
		for(String sortt:arr) {
			System.out.println(sortt);

		}
		System.out.println("-------------");
Collections.sort(arr);
		
		
		
		for(String sortt:arr) {
			System.out.println(sortt);

		}
	}
}
