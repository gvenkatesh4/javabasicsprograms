package Stringsconcept;

public class Countnoofwords {

	public static void main(String[] args) {
		
		String str = "saibaba s";
		String strr[] = str.split(" ");
		int count = 0;
		for(int i = 0;i<str.length();i++) {
			if(str.charAt(i)!= ' ') {
				count++;

			}
			
		}
		System.out.println(count);
		System.out.println(strr.length);
	}
}
