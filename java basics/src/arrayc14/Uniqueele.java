package arrayc14;
import java.util.Scanner;


public class Uniqueele {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the size");
		int  size;
		size = scan.nextInt();
		int a[] = new int[size];
		
		for(int i=0;i<size;i++)
		{
			a[i]=scan.nextInt();
		}
		uniqueele(a);
		
	}
public static void uniqueele(int []a) {
	
     for(int i=0;i<a.length;i++)
       {	int count=0;

	      for(int j=0;j<a.length;j++) {
		
		      if(a[i]==a[j]){
				count++;
			}
		
	      }
	      if(count==1)
	    		System.out.println(a[i]);


        }


	
}
	}


