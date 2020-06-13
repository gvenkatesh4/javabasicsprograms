package Extracoding;

public class Sumofallamstrongnumbers {

	public static void main(String[] args) {
		
		
		int num = 12000;
		if(num<=999) {

		int res = 0;
		while(num>0)
		{
			int a = num%10;
			res = res+a*a*a;
			num = num/10;
		}
		System.out.println(res);
	}
		else if(num>=1000&&num<10000) {
			int res1 = 0;
			while(num>0) {
				int a1 = num%10;
				res1 = res1+a1*a1*a1*a1;
				
				num = num/10;
			}
			System.out.println(res1);
		}
		else {
			System.out.println("invalid number");
		}
	}
	
	
}
