package mocktest1;

public class CountNines {
	public static int countAllNines(int x,int y){
	
		
		if(x<0||y<0)
			return -1;
		if(x==0||y==0)
			return -2;
int count=0;
		for(int i = x;i<=y;i++) {
			int digi = i%10;
		    int digit = i/10;
			if(digit==9) {
				count++;
			}		
			 if(digi==9) {
				 count++;
			 }
		}
		if(count==0)
			return -3;
			
			
		return count;
       }
		
	
	public static void main(String[] args) {
		System.out.println(countAllNines(75,78));
		System.out.println(countAllNines(900,898));
		System.out.println(countAllNines(9002223,89232));
	System.out.println(countAllNines(-2,-4));
		System.out.println(countAllNines(10,15));
		
			
	}

}
