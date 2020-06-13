package ww;

public class Fibanocciseries {
	
	public static void main(String[]args) {
		int a = 0 ;
		int b = 1 ;
		int c;
		for(int i = 1;i<=6;i++) {
			
			 c = a+b;
			a  =b;
			b = c;
			
			System.out.println(c);

			
		}

	}

}
