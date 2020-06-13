package p;

public class Rough {

	public static void main(String[] args) {
		String str = "abcd";
		
		String str1="";
		for(int i =str.length()-1;i>=0;i--) {
			//System.out.print(str.charAt(i));
			
			str1 = str1+str.charAt(i);
			
		}
		System.out.println(str1);
	}
}
