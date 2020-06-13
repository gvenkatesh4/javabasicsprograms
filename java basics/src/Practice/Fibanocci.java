package Practice;
import java.util.Scanner;
public class Fibanocci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the num");
		num = scan.nextInt();
		fiba(num);
	}
public static void fiba(int num) {
	int t1 = 0;
	int t2 = 1;
	int c;
	
	for(int i=0;i<=num;i++)
	{
	
	c = t1+t2;

	t1 =t2;

	t2 = c;
	System.out.println(c);


	
}

}
}
