package prepartion;

public class Findingfirstuniqueeleinarray {
	public static void main(String[] args) {
		
int arr[] = {1,2,3,4,4,1,5,8,9,9};
		
		
		for(int i =0;i<arr.length;i++) {
			boolean unique = true;
			for(int j = 0;j<arr.length;j++) 
			{
				if(i!=j&&arr[i]==arr[j])
				{
					unique = false;
					break;
					
				}
			}
			if(unique) {
				System.out.println(arr[i]);
				//break;
			}
		}
	}

}
