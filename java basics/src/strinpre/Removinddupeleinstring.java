package strinpre;

import java.util.HashSet;
import java.util.Set;

public class Removinddupeleinstring {
	
	public static void main(String[] args) {
		
		String s = "javaa";
		
		
		
		
		Set<Character>set = new HashSet<>();
		Set<Character>set1 = new HashSet<>();

		StringBuffer sf = new StringBuffer();
		StringBuffer sf1 = new StringBuffer();

		
		for(int i =0;i<s.length();i++) {
			Character c = s.charAt(i);
			if(!set.contains(c)){
				set.add(c);
				sf.append(c);
				
			}
			else
			{
				set1.add(c);
				sf1.append(c);
			}
		}
		System.out.println(sf);
		System.out.println("----");
		System.out.println(sf1);

	}

}
