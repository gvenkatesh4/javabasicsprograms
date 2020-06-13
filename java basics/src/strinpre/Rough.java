package strinpre;
public class Rough {
	public  static void main(String[] args) {
		
		
		int arr[] = {1,2,3,4,4,5,8,9,9};
		
		int i,j;
		for(i =0;i<arr.length;i++) {
			for(j = 0;j<i;j++) 
				if(arr[i]==arr[j]) 
					break;
					if(i==j)
					System.out.println(arr[i]);
					//return;
				
			}
		}
	}


