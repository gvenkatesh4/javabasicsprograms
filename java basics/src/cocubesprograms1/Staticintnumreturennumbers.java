package cocubesprograms1;

public class Staticintnumreturennumbers {
	
	public static void main (String[] args) {
		int n = 10;
		int m = 20;
		
	System.out.println("numbers are"+numbers(n,m));	
	}

	
	public static int numbers(int n,int m) {
		
		if(n>m) {
			return (n+m)-(n-m);
		}
		else
			return (m%n)-(m+n);
		
		
		
	}
}
