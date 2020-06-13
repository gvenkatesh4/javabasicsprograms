package extrapracice;

public class Charactercount {
	
	public static void main(String[]args) {
		
		
		String s= "talentsprint";
		
		char key = 't';
		
		int count = 0;
		for(int i=0;i<s.length();i++) {
			
		if(s.charAt(i)=='t') {
			count++;
		}
		
		}
		System.out.println(count);
		
		
	}

}
