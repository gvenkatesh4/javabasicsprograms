package ww;

public class Primenum {
	public  static void main(String[]args) {
		
		
		/*int a = 13;
		int count = 0;

		for(int i = 1;i<=a;i++) {
			if(a%i==0) 
				count++;
			
			
		}
		if(count==2) 
			System.out.println("it is prim num");
		else
			System.out.println("it is not prime num");*/
		
		
		
		int start = 1;
		int end = 20;
		for(int ii = start;ii<=end;ii++) 
		{		int counts = 0;

			
			for(int aa = 1;aa<=ii;aa++) 
			{
				if(ii%aa==0) 
					counts++;
				
			}
			if(counts==2) {
				System.out.println(ii);
		}
		
		}
	}

}
