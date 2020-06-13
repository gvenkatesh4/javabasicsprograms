package prepartion;

public class Prime {
	public static void main(String[] args) {
		
		
		
		int end = 10;
		for(int start = 1;start<end;start++) {
			
			int count = 0;
		for(int i =2;i<start;i++) 
		{
			if(start%i==0) 
			{
				
				count++;
			}
			
		}
		
		if(count==0)
			System.out.println(start);
	}
	}
}


