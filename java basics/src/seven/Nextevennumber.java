package seven;
import java.util.Scanner;
public class Nextevennumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the number");
		num = scan.nextInt();
		for(int i=num+1;i<100;i++)
		{
			if(i%2==0) {
				System.out.println("next even number"+i);
			break;
		}
		}
	}

}
