package arrayc14;
import java.util.Scanner;

public class Sorting {


		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			

			System.out.println("Enter Array size :");
	        int size = sc.nextInt();
			
			int a[] = new int[size];
			
			System.out.print("Enter Array Elements "+" :"+" ");
			for(int i =0;i<size;i++){
				a[i] =sc.nextInt();
			}
			   getsortedarray(a);
		}
		 public static void getsortedarray(int a[]){
			 for(int i = 0;i<a.length;i++){
				 for(int j =i+1;j<a.length;j++){
					 
					 if(a[i]>a[j]){
						 int temp = a[i];
						 a[i] = a[j];
						 a[j] = temp;
					 }
				 }
				 System.out.print(a[i] +" ");
			 } 
		 }
	}



