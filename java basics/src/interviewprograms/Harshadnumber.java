package interviewprograms;

public class Harshadnumber {

	public static void main(String[] args) {
		int num=18;
		int n = num;
		System.out.println(n);
		int sum = 0;
		while(n>0) {
			int digit = n%10;
		   sum = sum+digit;
		   n = n/10;
			}
if(num%sum==0) 
	System.out.println("it is harshadnumber");
	else
		System.out.println("it is not harshadnumber");

	}

}
