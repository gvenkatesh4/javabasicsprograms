package strinpre;

public class A {
	public static void main(String[]args) {
		
		
		int arr [] = {10,50,90,110,500};
		
		int min = arr[0];
		int max = arr[0];
		
		for(int i = 1;i<arr.length;i++) {
			if(arr[i]>max) {
				
				max = arr[i];
			}
			else
			{
				min = arr[i];
			}
		}
		System.out.println("largest ele="+max);
		System.out.println("smallest ele="+min);
	}

}
