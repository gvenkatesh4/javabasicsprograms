package Creative;
import java.util.Scanner;
public class Alaramscoremore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("enter day of the week");
		int day_of_the_week;
		day_of_the_week=scan.nextInt();

		System.out.println("enter the true/false");
		boolean vacation=scan.nextBoolean();
		
		if(day_of_the_week<0||day_of_the_week>6)
		{
			System.out.println("invalid inputs");
		}
		if(day_of_the_week>=1&&day_of_the_week<=5&&vacation==true)
			{
                     System.out.println("10:00");			
        }
		if(day_of_the_week>=1&&day_of_the_week<=5&&vacation==false)
				{
			System.out.println("7:00");
				}
		if(day_of_the_week==0&&vacation==true)
		{
			System.out.println("off");
		}
		if(day_of_the_week==6&&vacation==true)
		{
			System.out.println("off");
		}
		if(day_of_the_week==0&&vacation==false)
		{
			System.out.println("10:00");
		}
		if(day_of_the_week==6&&vacation==false)
		{
			System.out.println("10:00");
		}
		
		
	}

}
