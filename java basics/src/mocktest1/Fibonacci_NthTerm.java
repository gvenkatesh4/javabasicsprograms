package mocktest1;

public class Fibonacci_NthTerm {
	public static void main(String[] args) {
		System.out.println(getNthTermOfFibonacciSeries(7));
	}

	public static int getNthTermOfFibonacciSeries(int nthTerm) {

	if(nthTerm<=0)
		return -1;
	/*if(nthTerm==1)
		return 0;
	if(nthTerm == 2)
		return 1;
*/	
	int a = 0;
	int b = 1;
	int s=0;
	
	for(int i =2;i<nthTerm;i++) {

		s= a+b;

		a= b;

		b = s;

	}
	
	return s;

	}
}
