package Stringsconcept;

import java.util.Scanner;

public class Stabc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan =new Scanner(System.in);
		System.out.println("enter the string");
		 String  str=scan.nextLine();
		   String result = " ";
			String result2=" ";
			
		 for(int i=0;i<str.length();i++) {
		char ch=str.charAt(i);

		if(Character.isAlphabetic(ch)!=Character.isDigit(ch)) {
			
		
			 result=result+ch;
		}
		 if(Character.isAlphabetic(ch)==Character.isDigit(ch)){
			 result2=result2+ch;
			
		}
		
	}
		 System.out.println(result2.trim()+result.trim()) ;
		 
		
		 
}
}