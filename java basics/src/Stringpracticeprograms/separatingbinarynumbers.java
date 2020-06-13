package Stringpracticeprograms;

public class separatingbinarynumbers {

	public static void main(String[]args) {
		String str = "00111111";
		String s = " ";
		char y[]=str.toCharArray();
		String r = " ";
		
		char k = '1';
		
	int  i = 0;
	
	int l = str.length();
	
	while(i!=l) {
		
		if(y[i]==k){
			s = s+y[i];
		}
		else 
		{
			r = r+y[i];
		}
		++i;
	}
	System.out.println(s.trim()+r.trim());
	}
	
}
	

