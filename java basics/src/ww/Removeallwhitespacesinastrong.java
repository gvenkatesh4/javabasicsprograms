package ww;

public class Removeallwhitespacesinastrong {

	public static void main(String[] args) {
		
	
	String str = " java java java";
	String ha = "";
	for(int i = 0;i<str.length();i++) {
		if(str.charAt(i)!=' ') {
			ha = ha+str.charAt(i);
		}
		
		
	}
	System.out.println(ha);
	
}
}