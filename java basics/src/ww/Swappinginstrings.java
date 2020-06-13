package ww;

public class Swappinginstrings {
	
	public static void main(String[]args) {
		
		String s1 = "java";
		String s2 = "j2ee";
		
		
		s1 = s1+s2;
		s2 = s1.substring(0,s1.length()-s2.length());
		System.out.println(s1.length()-s2.length());
		System.out.println(s2.length());
		s1 = s1.substring(s2.length());
		
		System.out.println(s1);
		System.out.println(s2);
		
		
		
	}

}
