package Creative;
import java.util.Scanner;
public class Booleanss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the true/false");
		boolean b1=scan.nextBoolean();
		boolean b2=scan.nextBoolean();
		boolean b3=scan.nextBoolean();
		

	System.out.println(trueorfalse(b1,b2,b3));	

	}
public static boolean trueorfalse(boolean b1,boolean b2,boolean b3)
{
	if(b1==true&&b2==true&&b3==true) {
	
	return true;
	}
	if(b1==true&&b2==true&&b3==false) {
		
		return true;
		}
	if(b1==true&&b2==false&&b3==false) {
		
		return false;
		}
	if(b1==false&&b2==false&&b3==false) {
		return false;
	}
	
	return false;
		
	
	
}
}
