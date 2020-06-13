package cocubesprograms1;
import java.util.Arrays;

public class Modifyleasttwoelebydividingby100andmultipleyby9 {
	public static void main(String[] args) {
		
		int arr[] = {1000,2000,300,500,10000};
		
		Arrays.sort(arr);
		
		arr[0] = (arr[0]/100)*9;
		arr[1] = (arr[1]/100)*9;
		
		for(int i =0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}

}
