package mocktest1;


public class ProductPanlindrome {

	public static void main(String[] args) {
		final int START = 10;
		final int END = 100;

		System.out.println(ProductPanlindrome.getCount(START, END));

	}

	public static int getCount(int start, int end) {
		int countofpalindrome=0;
		for(int i=start;i<=end;i++)
		{
			for(int j=start;j<=end;j++)
			{
				int pro = (i*j);
				
				int temp = pro;
				
				int rev = 0;
				
				while(temp>0)
				{
					int digit = temp%10;
					rev = rev*10+digit;
					temp=temp/10;
				}
				if(pro==rev) {
					countofpalindrome++;
				}
				
			}
		}
		return countofpalindrome;

	}

}


