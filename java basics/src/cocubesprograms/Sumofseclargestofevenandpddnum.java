package cocubesprograms;

public class Sumofseclargestofevenandpddnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {45, 30, 15, 6, 25, 18};
secmaxx(a);				
	}
		
			public static void secmaxx(int a[]) {
	int total = a.length;			
				/*for(int i =0;i<a.length;i++)
				{
					for(int j=i+1;j<a.length;j++)
					{
						if(a[i]>a[j]) 
						{
							
							int temp = a[i];
							a[i] = a[j];
							a[j] = temp;
							
						}
					}
					
				}*/
				for(int i =0;i<total;i++) {
					int w = 3;
					int r  = 3;
					if(a[i]%2==0) 
					{
						int even = a[i];
						System.out.println(even);
						for(int y = 0;y<r;y++) {
							for(int u =y+1;u<r;u++) {
								if(even[y]>even[u]) {
									int t = a[y];
									a[y] = a[u];
									a[u] = t;
								}
								
							}
						}
System.out.println(a[w-2]);
					}
					/*else if(a[i]%2!=0) {
						int odd = a[i];
						System.out.println(odd);
					}*/
						
				}

		}
	}


