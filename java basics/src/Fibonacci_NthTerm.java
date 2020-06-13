

public class Fibonacci_NthTerm {

	public static void main(String[] args) {
		System.out.println(getNthTermOfFibonacciSeries(10));
	}

	public static int getNthTermOfFibonacciSeries(int nthTerm) {
		// ADD YOUR CODE HERE
	int num=4;
	int a =0;
	int b = 1;
	int c;
	int s=0;
	if(num<=0) {	
		return -1;
	}
	
	for(int i=1;i<=num;i++)
	{
		c= a+b;
		
		a=b;
		b=c;
		s= s+c;
	}
	
	return s;
	}


}
