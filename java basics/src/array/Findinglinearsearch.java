package array;
import java.util.Scanner;
public class Findinglinearsearch {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the size");
		int size = scan.nextInt();
		int arr[]=new int [size];
		
		for(int i=0;i<size;i++)
		{
			arr[i]=scan.nextInt();
		}
System.out.println("enter the search element");		
		int se = scan.nextInt();
     System.out.println(linearsearch(arr,se));
	}
public static String linearsearch(int []arr,int se) {
	for(int i=0;i<arr.length;i++)
	{
			if(arr[i]==se)
			{
			
				return "element fount at position "+ i;
			}
	}
				
					return " element not found";
		}
}
