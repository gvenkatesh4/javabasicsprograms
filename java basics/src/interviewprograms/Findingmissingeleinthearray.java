package interviewprograms;
import java.util.Scanner;


public class Findingmissingeleinthearray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {1,2,3,4,5,7};
		int noofele=a.length+1;
		int totalele=noofele*(noofele+1)/2;
		//System.out.println(totalele);
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			sum=sum+a[i];

		}
        System.out.println(totalele-sum);

      
	}
}
