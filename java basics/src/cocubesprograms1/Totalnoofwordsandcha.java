package cocubesprograms1;

public class Totalnoofwordsandcha {

	public static void main(String[] args) {
		
		String str = "hanuman saibaba";
		
		int count = 0;
		for(int i = 0;i<str.length();i++) {
			if( str.charAt(i)!=' ') {
			count++;
		}
		}
		String []word = str.split(" ");
		
	
		System.out.println(word.length);
		System.out.println(count);
}
}