package prepartion;

public class Fibo {
	public static void main(String[] args) {
		int a = 0;
		int b = 1;
		int c ;
		int num = 10;
		for(int i =0;i<=num;i++) {
			c = a+b;
			a =b;
			
			b = c;
			
			System.out.println(c);

		}
		
	}

}
