package p;

public class Checkingbinarynumberornat {

	public  static void  main(String[] args) {
	
		
		int num = 1011;
		
		
		int r= 0;
		int c = 0;
		
		while(num>0) {
			if((num%10==0||num%10==1))
				c++;
			r++;
			
			num = num/10;
			//System.out.println(c);
			System.out.println(r);
			}
		
		if(c==r) 
			System.out.println("it is binary number");
			else
				System.out.println("it is not binary");
		
		}
	}

