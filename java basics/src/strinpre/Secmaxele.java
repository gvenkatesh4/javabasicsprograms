package strinpre;

public class Secmaxele {
	
	public static void main(String[]args) {
		
		int num =6259;
		int max = 0;
		int secmax = 0;
		
		while(num>0) {
			
			int digit = num%10;
			
			if(digit>max) {
				secmax = max;
				max = digit;
				
			}
			else if
			
				(digit<max&&digit>secmax) 
				
				secmax = digit;
			
		num = num/10;	
		}
		System.out.println(secmax);
		
	}

}
