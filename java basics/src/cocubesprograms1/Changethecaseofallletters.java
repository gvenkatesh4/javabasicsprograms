package cocubesprograms1;

public class Changethecaseofallletters {
	public static void main(String[] args) {
		
		String str = "This Is a SAMPLE text!";
	
		String result = "";
		for(int i=0;i<str.length();i++) {
			
			char ch = str.charAt(i);
			
			if(Character.isLowerCase(ch)) {
				result = result+Character.toUpperCase(ch);
			}
			if(Character.isUpperCase(ch)) {
				result = result+Character.toLowerCase(ch);
			}
		}
		System.out.println(result);
	}

}
