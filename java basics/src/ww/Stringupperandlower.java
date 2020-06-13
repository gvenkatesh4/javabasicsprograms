package ww;

public class Stringupperandlower {
	
	public static void main(String[]args) {
		
		String str = " javA";
		
		String str1 = "";
		
		for(int i = 0;i<str.length();i++) {
			
			char ch = str.charAt(i);
			
			if(Character.isLowerCase(ch)) 
				str1 = str1+Character.toUpperCase(ch);
			else
				str1 = str1+Character.toLowerCase(ch);
			
			
		}
		System.out.println(str1);
		
	}

}
