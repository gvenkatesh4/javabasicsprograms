package Stringpracticeprograms;

public class countingwhitespaces {

	public static void main(String[] args) {
		
		String str = "he l  lo wo   rld";
		int count = 0;
		for(int i =0;i<str.length();i++) {
			if(str.charAt(i)== ' ') {
				count++;
			}
		}
		System.out.println(count);
	}
}



