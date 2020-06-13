package mocktests;
public class RoundedSum {
	public static void main(String[] args) {
		int a = 20, b = 30, c = 40;
		System.out.println(sumOfRoundedValues(a,b,c));
	}

	public static int sumOfRoundedValues(int n1,int n2,int n3) {
		int sum = 0; 
		int sum1 = 0;
		int sum2 = 0;
		if(n1<=5||n2<=5||n3<=5) {
			return-1;
		}
		int d = n1%10;
		int d1 = n1/10;
		
		
		if(d<5) {
			sum = d1*10;
		}
		 else   {
			sum = (d1+1)*10;
		}
		int h = n2%10;
		int h1 = n2/10;
		  if(h<5) {
			 sum1 = h1*10;
		 }
		  else {
			  sum1 = (h1+1)*10;
		  }
		  
		  int s = n3%10;
		  int s1 = n3/10;
		  if(s<5) {
			  sum2 = s1*10;
		  }
		  else {
			  sum2 = (s1+1)*10;
		  }
		return sum+sum1+sum2;
	}
	
	
}
