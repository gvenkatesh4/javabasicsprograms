package prepartion;

public class Stringpalin {
	
	public static void main(String[] args) {
		
		String s = "dad";
		
		String w = s;
		
		int a = s.length();
		String s1 = " ";
		for(int i=a-1;i>=0;i--) 
		{
			s1 = s1+s.charAt(i);
		}
		if(w.equals(s1)) 
			System.out.println("it is string palindrome");
			else
				System.out.println("it is not palindrome");
		

	}

}
