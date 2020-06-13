package Extracoding;

public class ECC_33_ListPrimes
{

	public static void main(String[] arg) {
		int num1 = 10;
		int num2 = 20;
		getPrimeNumbers(num1, num2);
	}

	public static void getPrimeNumbers(int num1,int num2)
	{
		

			for (int i = num1; i < num2; i++) 
			{
				int count=0;

				for (int j = 2; j < i; j++) 
				{
					if (i % j == 0) 
					{
						count++;
				    }
		        }
			
				if (count == 0)
					System.out.println(i);
			}

	}
}
