package interviewprograms;

import java.util.Arrays;

import basics.Array;

public class Anagramprogramuisnginbulitmethods {

	public static void main(String[] args) {
		String h="asdf";
		String i = "zxcv";
		
		char[] o = h.toCharArray();
		char[]k = i.toCharArray();
		
		Arrays.sort(o);
		Arrays.sort(k);
Boolean result=Arrays.equals(o, k);
	
if(result==true) {
	System.out.println("it is anagram");
}
	else
		System.out.println("it is not anagram");
}
		
	}
	
