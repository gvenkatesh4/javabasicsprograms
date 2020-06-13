package prepartion;

public class Removewhitespacesfromastring {
	
	public static void main(String[] args) {
		
		String str = "sai baba shridi";
		
		char s[] = str.toCharArray();
		
		for(int i =0;i<str.length();i++) {
			
			if(s[i]!= ' ') {
				System.out.print(s[i]);
			}
		}
	}

}
