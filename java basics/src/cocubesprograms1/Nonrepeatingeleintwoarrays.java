package cocubesprograms1;

public class Nonrepeatingeleintwoarrays 
{
	
	public static void main(String[] args) {
		
		int a[] = {2,4,7,324,123,6,3,5,2};
		int b[] = {3,7,3,4,7,5,1};
		
		int r =0;
		if(a.length>=b.length) 
		{
			for(int i=0;i<a.length;i++) 
			{
				int count=0;
				for(int j=0;j<b.length;j++) 
				{
					if(a[i]==b[j]) 
					
						count++;
				}		
					if(count==0) 
					
						r++;
					
					System.out.println(r);
				}
		}
			else {
					for(int i =0;i<b.length;i++) 
					{
						
						int count=0;
						for(int j =0;j<b.length;j++) {
						
							if(b[i]==a[j])
								count++;
						}
						if(count==0)
							r++;
					}
					System.out.println(r);
				}
				
			
			
			
		
}	


}
