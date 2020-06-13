package mocktest1;

public class UniqueNumbers {

	public static String getUniqueNumbers(int a[])
	{
		if(a==null)
	{
			return null;
		}
		
		
		String result = "";
		for(int i =0;i<a.length;i++) 
		{
			int count=0;
			for(int j = 0;j<a.length;j++)
			{
				if(a[i]==a[j]) 
				{
					count++;
				}
			}
			if(count==1)
			
			System.out.print(a[i]+" ");
			
				
		}
		
		
		return result;
	}
	
	public static void main(String[] args) {
		int a[] = {2,5,3,6,5,1};
		System.out.println(getUniqueNumbers(a));
	}
}