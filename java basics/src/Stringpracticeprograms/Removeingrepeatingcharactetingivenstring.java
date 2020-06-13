package Stringpracticeprograms;

public class Removeingrepeatingcharactetingivenstring {

	public static void main(String[] args) {
		String s="spIderslies";
		char y[]=s.toCharArray();
		int size = s.length();
		
		char key = 's';
		int i = 0;
		String result=" ";
		String removedchar=" ";
		while(i!=size)
		{
			if(y[i]!=key) {
				result = result+y[i];
		
			}
			else
				if(y[i]==key) {
					removedchar = removedchar+y[i];
				}
			++i;

		}
		
System.out.println(result.trim());
System.out.println(removedchar.trim());
	}

	

}
