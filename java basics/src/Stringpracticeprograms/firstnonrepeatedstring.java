package Stringpracticeprograms;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
public class firstnonrepeatedstring {

	public static void main(String[] args) {
		char c = getfirstnonrepeatedchar("abcabcdeft");
		System.out.println(c);
	}

	public static char getfirstnonrepeatedchar(String str) {
		Map<Character,Integer>counttMap=new LinkedHashMap<Character,Integer>(str.length());
		for(char ch:str.toCharArray()) {
			counttMap.put(ch,counttMap.containsKey(ch)?counttMap.get(ch)+1:1);
			
		}
		
		for( Entry<Character, Integer>entry:counttMap.entrySet()) {
			if(entry.getValue()==1) {
				return entry.getKey();
				//System.out.println(entry);
			}
		}
		throw new RuntimeException("did't find any non repeated character");
		}
	}
