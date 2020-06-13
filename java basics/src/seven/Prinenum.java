package seven;
import java.util.Scanner;
import java.util.*;

public class Prinenum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int s1,s2,flag = 0;
Scanner scan = new Scanner(System.in);
System.out.println("enter the lower limit");
s1 = scan.nextInt();
System.out.println("enter the upper limit");
s2 = scan.nextInt();
for(int i = s1;i<=s2;i++) {
	for(int j = 2;j<i;j++)
	{
		if(i%j==0)
		{
	
		flag = 0;
		break;
}
	else {
	flag =1;
	}
}
{
	if(flag==1)
	{
	System.out.println(i);
	}

}
}

}}