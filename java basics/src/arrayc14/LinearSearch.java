package arrayc14;
import java.util.Scanner;
public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter the size");
		Scanner scan = new Scanner(System.in);
		int size = scan.nextInt();
int i;
System.out.println("enter the array elements");
		int a[] = new int[size];
		
		
		for(i=0;i<size;i++)
		{
			a[i]=scan.nextInt();
			
		}
		System.out.println("enter the search element");
		int se=scan.nextInt();
		
		
		System.out.println(getsearchelement(a,se));
		}
public static String getsearchelement(int [] a,int se) {
	for(int i=0;i<a.length;i++)
	{
		if(a[i]==se)
		{
			return " element fount at position:"+i;
			
		}
		
	}
	
	return "element not found";
}
	}

