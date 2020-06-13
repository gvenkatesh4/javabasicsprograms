package mocktest1;
public class FindSecondMaxDigit {
	
	public static int findSecondMaxDigit(int n)
	{
		if(n<=0)
			return -1;
					
					
		int secmax = 0;
		int max = 0;
		while(n>0) {
			int digit = n%10;
			if(digit>max) {
				secmax = max;
				max = digit;
			              }
			else if(digit<max&&digit>secmax) 
				secmax=digit;
				n=n/10;
			
				
		}
		
		return secmax;
	}
	public static void main(String[] args) {
		int n=1234;
		System.out.println(findSecondMaxDigit(n));
	}
}
