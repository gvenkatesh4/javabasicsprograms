package arrayinterviewprepartion;

public class Secmaxeleinarray {

	
	public static void main(String[] args) {
		
		int[] a = {10,20,30,90,50};
		
		int max = 0;
		int secmax = 0;
		
		for(int i = 0;i<a.length;i++) {
			int digit = a[i];
			if(digit>max) 
			{
				secmax = max;
				max = digit;
			}
			
				
			else if(digit<max&&digit>secmax)
				
				secmax = digit;
			
		}
		System.out.println(secmax);
		System.out.println(max);
	}
}
