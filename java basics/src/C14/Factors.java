package C14;
import java.util.*;
import java.util.*;

public class Factors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the num");
		num = scan.nextInt();
fact(num);
	}
public static void fact(int num) {
	for(int i=1;i<num;i++)
	
	{
		if(num%i==0) {
			System.out.println(i);
		}
	}
}
	
	
}

