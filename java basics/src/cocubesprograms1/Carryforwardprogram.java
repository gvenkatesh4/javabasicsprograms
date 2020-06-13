package cocubesprograms1;

public class Carryforwardprogram {
	public static void main(String[] args) {
		int n1 = 125;
		int n2 = 125;
		int rem1 = 0;
		int rem2 = 0;
		int sum = 0;
		int count = 0;
		
		while(n1>0&&n2>0) {
			rem1 = n1%10; 
			rem2 = n2%10;
			
			
			sum = rem1+rem2;
			if(sum>=10) {
				count++;
			}
			n1 = n1/10;
			n2 = n2/10;
		}
		if(count==0) 
			System.out.println("there is no carry forward");
			else
				System.out.println("number of carry forwards:"+count);
		
	}

}
