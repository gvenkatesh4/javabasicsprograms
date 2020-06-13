


public class ProductPanlindrome1111 {

	public static void main(String[] args) {
		final int START = 10;
		final int END = 100;

		System.out.println(ProductPanlindrome1111.getCount(START, END));

	}

	public static int getCount(int start, int end) {
		int num;
		
		for(int i=start;i<=end;i++)
		{
			int n =i;
			int reverse=0;
			int digit = 0;
			while(n>0)
			{
				digit = n%10;
				 reverse = reverse*10+digit;
				  n = n/10;
				
			}
			if(reverse==i) {
			System.out.println(i);
			}

		}
		int n = 0;
		return n;

	}

}
