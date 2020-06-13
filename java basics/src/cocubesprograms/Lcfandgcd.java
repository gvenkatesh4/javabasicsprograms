package cocubesprograms;

public class Lcfandgcd {
public static void main(String[] args) {
	int num1 = 30;
	int num2 = 36;
	int num3 = 24;
	int gcd = 1;
	for(int i =1;i<num1&&i<num2&&i<num3;i++) {
		
		if(num1%i==0&&num2%i==0&&num3%i==0) {
			gcd = i;
		}
		
	}
	System.out.println(gcd);
	
	int lcm = (num1*num2)/gcd;
	System.out.println(lcm);
}
}
