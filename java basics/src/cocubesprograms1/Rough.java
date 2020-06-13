package cocubesprograms1;

public class Rough {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int number1 = 125;
		int number2 = 125;
		int rem1 = 0;
		int rem2= 0;
		int sum = 0;
		int count = 0;
		while(number1>0&&number2>0) {
			
			rem1 = number1%10;
			rem2 = number2%10;
			
			sum = rem1+rem2;
			if(sum>=10) {
				count++;
			}
			number1 = number1/10;
			number2 = number2/10;
		}
		if(count==0)
			System.out.println("there is no carry forwards");
		else
			System.out.println("no of carry forwards:"+count);
	}

}
