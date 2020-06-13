package ww;

public class Stringrev {
	public static void main(String args[]) {
		
		String str = "java";
		
		StringBuilder str1 = new StringBuilder();
		
		str1.append(str);
		
		str1.reverse();
		System.out.println(str1);
		
		
		String s = "";
		for(int i =str.length()-1;i>=0;i--) {
			s = s+str.charAt(i);
			
		}
		System.out.println(s);
	}

}
