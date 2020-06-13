package C14;
import java.util.Scanner;

public class primeinrange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
	
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the number");
		num = scan.nextInt();
		int temp1 = 0;
		for(int i=2;i<=num;i++)
		{
			for(int j=2;j<i;j++)
			{
				if(i%j==0)
				{
					temp1 = temp1+i;
				}
			}
			if(temp1==0)
			{
				System.out.println(i);
			}
				else
			temp1=0;
			
			
			
			
		}
	}

}
		