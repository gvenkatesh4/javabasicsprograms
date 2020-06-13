package Extracoding;
public class ECC_44_GeneratePalindrome {

	public static void main(String args[]) {
		int num =165;

		getPalindromeList(num);
	}
	

	public static void getPalindromeList(int num) {
		if(num<=0)
			System.out.println("1");
		if(num<=100||num>=999)
			System.out.println("2");
		if(num<99||num>=1000)
			System.out.println("3");
			
		 
			int reverse = 0;
			int digit = 0;
			while(num>0)
			{
				digit = num%10;
				reverse = reverse*10+digit;
				num = num/10;
			}
			
					int sum = num+reverse;
					System.out.println(sum);
					num =  sum;
			
		
		
		
	}

}
