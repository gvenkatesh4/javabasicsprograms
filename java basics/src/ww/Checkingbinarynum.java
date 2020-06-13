package ww;

public class Checkingbinarynum {

	public static void main(String[]args) {
		
		
		int r = 0;
		int c = 0;
		
		int num = 1011;
		
		while(num>0) {
			if(num%10==0||num%10==1) {
				r++;
				c++;
				num = num/10;
			}
		}
			if(r==c) {
				System.out.println("it is binary num");
			}
			else
			{
				System.out.println("it is not binaty num");
			}
		
		
	}
}
