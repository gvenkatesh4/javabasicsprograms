package strinpre;

public class Firstnonrepeatedcharacterinastring {
	
	public static void main(String[] args) {
		
		
		String str = "java";
				
		char[] b = str.toCharArray();
		
		for(int i =0;i<b.length;i++) {
			for(int j =i+1;j<b.length;j++) {
				if(b[i]!=b[j]) {
					System.out.println(b[i]);
					break;
				}
			}
		}
		
		
		
	}

}
