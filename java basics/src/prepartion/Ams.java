package prepartion;

public class Ams {
	public static void main(String[] args) {
		
		int num = 153;
		int temp = num;
		int sum = 0;
		while(num>0) {
			int digit = num%10;
			sum = sum+(digit*digit*digit);
			num = num/10;
		}
		if(temp==sum) 
			System.out.println("it is ams num");
			else
				System.out.println("it is not ams");
		}
	}


