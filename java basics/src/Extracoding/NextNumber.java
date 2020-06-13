package Extracoding;


public class NextNumber {

	public static void main(String[] args) {
		System.out.println(NextNumber.nextNum(12465));
		System.out.println(NextNumber.nextNum(111222));

		System.out.println(NextNumber.nextNum(12465));
		System.out.println(NextNumber.nextNum(12466));
		System.out.println(NextNumber.nextNum(13575));
	System.out.println(NextNumber.nextNum(123456));

	}

	public static int nextNum(int num) {
		int t = num;
		int even = 0;
		int odd = 0;
		int digit1=num;
		while(num>0) {
		int digit = num%10;
		if(digit%2==0) 
		{
			even++;
		}
		else {
			odd++;
		    }
		num=num/10;
		
		
	          }
		//if(even>odd) {
			//return t+1;
		//}
		if(even==odd)
		{
			return t;
		}
		else if(digit1%2==0) {
		return t+2;
		}
		else
		return t+2;
		
	}

}