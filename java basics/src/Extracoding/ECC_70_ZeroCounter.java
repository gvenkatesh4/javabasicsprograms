package Extracoding;

public class ECC_70_ZeroCounter {

		public static void main(String[] args) {
			
			System.out.println(ECC_70_ZeroCounter.countZeros(1200));
			System.out.println(ECC_70_ZeroCounter.countZeros(1000));
			System.out.println(ECC_70_ZeroCounter.countZeros(000));

		}

		public static int countZeros(int num) {
			int count = 0;
			int rem = 0;
			
			int digit = num;
			
			if(digit==0) {
				int val = 1;
				return val;
			}
				
			while (num>0) 
			{
				
				    rem = num % 10 ;
				    if(rem==0)
					count++;
					num = num/10;
					
			}
			return count;		
		}

	

}
