package zarraysprep;

public class Twoarraysareequalornot {

	public static void main(String[]args) {
		
		
		int a[] = {10,20,30,40,50};
		int b[] = {10,20,30,40,50,60};
		
		boolean equalornot = true;
		
		
		if(a.length == b.length) 
		{
			
		
		for(int i =0;i<a.length;i++) 
		{
			
				if(a[i]!=b[i]) 
				{
					
					equalornot = false;
				}
			
		}
		
		
			
		
		
		}else{
			equalornot = false;
		}
		if(equalornot) {
			System.out.println("two arrays are equal");
		}
		else
		{
			System.out.println("not equal");
		}
		
	}

}