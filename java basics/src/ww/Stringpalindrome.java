package ww;

public class Stringpalindrome {
	
	public static void main(String[]args) {
		
		
		String str = "bob";
		
		int s = str.length();
		
		String a = "";
		
		for(int ab = s-1;ab>=0;ab--) {
			a = a+str.charAt(ab);
		}
		
		if(str.equals(a)) {
			System.out.println("it is palindrome");
		}
		else
		{
			System.out.println("it is not palindrome");
		}
	}

}
