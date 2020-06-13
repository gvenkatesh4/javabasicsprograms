package prepartion;

public class Palin {
public static void main(String[] args) {
	
	int num = 121;
	
	int temp = num;
	int sum = 0;
	while(num>0) {
		int digit = num%10;
		sum = sum*10+digit;
		num = num/10;
	}
	if(sum==temp) 
		System.out.println("it is palindrome number");
		else
			System.out.println("it is not palindrome number");
	
}
}
