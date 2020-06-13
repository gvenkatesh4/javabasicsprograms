package p;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class Findingnoofrepeatingeleinarraylist {
	
	public static void main(String[] args) {
		
		
		
		ArrayList<String>dulp = new ArrayList<String>();
		
		dulp.add("facebook");
		dulp.add("google");
		dulp.add("facebook");
		dulp.add("google");
		dulp.add("microsoft");
		dulp.add("adobe");
		dulp.add("opentext");
		dulp.add("MAQ");
		
		System.out.println(dulp);
		System.out.println("---------------");
		
		for(String str:dulp) {
			
			
			System.out.println(str);
		}
		
		
		System.out.println("---------------");
		HashSet<String>dulpp = new HashSet<String>(dulp);
		
		
		for(String str1:dulpp) {
			//System.out.println(str1);
		System.out.println(	Collections.frequency(dulp, str1)+"=" + str1);
		}
		
		System.out.println("--------");
		System.out.println("hashset will not contain duplicates");
		for(String str1:dulpp) {
			System.out.println(str1);
		}
		
		
		
		
		
		
		
		
		
		
	}

}
