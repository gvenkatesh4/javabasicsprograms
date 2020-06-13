package Stringpracticeprograms;

public class Removingvowelsfromastring {

	public static void main(String[] args) {
		String s = "bgbgba";
		char b[] =s.toCharArray();
		int size = s.length();
		
		char key = 'a';
		char key1 = 'e';
		char key2 = 'i';
		char key3 = 'o';
		char key4 = 'u';
		
		int i =0;
		String result="";
		String removedchar = "";
		while(i!=size) 
		{
		
			if(b[i]!=key||b[i]!=key1||b[i]!=key2||b[i]!=key3||b[i]!=key4) 
			{
				result = result+b[i];
			}
			else 
				if(b[i]==key||b[i]==key1||b[i]==key2||b[i]==key3||b[i]==key4)
				{
				
				removedchar = removedchar+b[i];
			       }
			
			++i;
		}
		System.out.println(result);
		System.out.println("-----------");
		//System.out.println(removedchar);
}
		
}
