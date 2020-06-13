package Practice;
import java.util.Scanner;
public class Gymworkouts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the number");
		num = scan.nextInt();
workouts(num);
	}
public static void workouts(int num) {
	
   int	n1 = 1;
   int n2 = 2;
   int n3 = 3;
   int n4 = 0;
   
		for(int i=4;i<=num;i++)
		{
			
			n4 = n1+n2+n3;
			
			n1 = n2;
			n2 = n3;
			n3 = n4;
			
		}
		System.out.println("on"+num+" 'th day he can work" +n4+"mins");

	
}
}
