package Creative;
import java.util.Scanner;
public class Primeinrange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int start;
		int end;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the number");
		start = scan.nextInt();
		end = scan.nextInt();

		for(int num=start;num<end;num++)
		{
			int count=0;
		for(int i=2;i<num;i++)
		{
			if(num%i==0)
			{
				count++;
			}
		}
		if(count==0)
		
			System.out.println(num);
			
		
		

	}

}
}