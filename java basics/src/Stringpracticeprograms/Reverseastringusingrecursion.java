package Stringpracticeprograms;


public class Reverseastringusingrecursion {

	public static void main(String[] args) {
		String str = "maatv";
		
		System.out.println(reversestring(str));
	}

	public static String reversestring(String str) {
		if(str==null||str.length()<=1) {
		return str;
		
		}
		return reversestring(str.substring(1))+str.charAt(0);
		
	}
	
	
	
}
