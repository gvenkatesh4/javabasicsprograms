package cocubesprograms1;

import java.util.Scanner;

public class Stringprogrm {
	
	public static void main(String[] args) {
		System.out.println("enter");
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		String result = " ";
		String result1 = " ";
		
		for(int i =0;i<s.length();i++) {
			char ch = s.charAt(i); 
			
			if(Character.isAlphabetic(ch)!=Character.isDigit(ch)) {
				result = result+ch;
			}
			if(Character.isAlphabetic(ch)==Character.isDigit(ch)) {
				result1 = result1+ch;
			}
		}		System.out.println(result1.trim()+result.trim());


	}

}
