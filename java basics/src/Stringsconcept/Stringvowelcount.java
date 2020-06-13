package Stringsconcept;
import java.util.Scanner;
public class Stringvowelcount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the string");
		String str = scan.nextLine();
		vowelandoddcount(str);
	}
public static void vowelandoddcount(String str) {
	
	int vowelcount=0;
	int conscount=0;
	
for(int i=0;i<str.length();i++)
{
	
if(str.charAt(i)=='a'||str.charAt(i)=='e'||
str.charAt(i)=='i'||str.charAt(i)=='o'||
str.charAt(i)=='u'||str.charAt(i)=='A'||str.charAt(i)=='E'||
str.charAt(i)=='I'||str.charAt(i)=='O'||
str.charAt(i)=='U')
vowelcount++;

else if(str.charAt(i)>'a'&&str.charAt(i)<='z'&&
str.charAt(i)>'A'&&str.charAt(i)<='Z')

conscount++;

	
}
	
	
	System.out.println("vowel count:"+vowelcount);
	System.out.println("cons count:"+conscount);
}
}
