package p;
import java.util.Scanner;

public class Sortnumberswithoutusinginbuiltmethod {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the required smallest number");
		int num = scan.nextInt();
		
		int arr[]= {1,5,9,6,7,8};
		
		for(int i = 0;i<arr.length;i++)
		{
			for(int j = i+1;j<arr.length;j++)
			{
				
				if(arr[i]>arr[j]) 
				{
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
			System.out.println(arr[i]);
		}
		System.out.println("smallest element");
		System.out.println(arr[num-1]);

	}
}
