package Practice;
import java.util.Scanner;
public class Sumofevennatnum {
	public static void main(String[] args) {
			int num;
			Scanner scan = new Scanner(System.in);
			System.out.println("enter the number");
			num = scan.nextInt();
			sumofnat(num);
}
	public static void sumofnat(int num) {
	int	sum = 0;
	int i=1;
		while(i<=num)
		{
			if(i%2==0)
			{
				System.out.println(i);
				sum = sum+i;
			}
			i++;
			
		}
	}
}