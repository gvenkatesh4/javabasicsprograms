package ww;

import java.util.HashMap;
import java.util.Set;

public class Duplicatewordsinastring {
	
	public static void main(String[]args) {
		
		String str = "javatalent spring java";
		
		String[] abc = str.split(" ");
		
		
		System.out.println(abc.length);
		
		System.out.println("-------------------");
		int count = 0;
		String st = "java@abc@java";
		
		String abcd[] = st.split("@");
		
		HashMap<String,Integer>wordcount = new HashMap<String, Integer>();
		
		
		
		for(String st1:abcd) 
		{
			if(wordcount.containsKey(st1)) 
			{
				wordcount.put(st1,wordcount.get(st1)+1);
			}
			else {
				wordcount.put(st1,1);
			}
			
		}
		System.out.println(wordcount);
		
		Set<String>worddup = wordcount.keySet();
		//System.out.println(wordcount.keySet());
		for(String wordss :worddup) {
			
			if(wordcount.get(wordss)>1)
			{
				System.out.println(wordss+":"+wordcount.get(wordss));
			}
			
			
		}
	}

}
