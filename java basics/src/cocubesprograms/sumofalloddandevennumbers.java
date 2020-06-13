package cocubesprograms;

public class sumofalloddandevennumbers {

	public static void main(String[] args) {
		int num = 111222;
		
		int sum = 0;
		int sum1 = 0;
		while(num>0) {
			int digit = num%10;
			if(digit%2!=0) {
				sum =sum+digit;
			}
			else {
				sum1 = sum1+digit;
			}
			num = num/10;
		}
		System.out.println("odd sum"+sum);
		System.out.println("even sum"+sum1);
	}

}
