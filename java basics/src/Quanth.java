
public class Quanth {

	public static void main(String[] args) {
		System.out.println(Quanth.getQuadricSequence(2));
		

	}

	public static String getQuadricSequence(int n) {
		String r=" ";
	    int sum=0;
		int rev=0;
		int count=0;
		
		if(n<=0) {
			return null;
		}	
		else
		{
			for(int i =1;i<=n;i++) {
				sum+=i;
				if(sum>10) {
					if(sum%10==sum/10) {
						count++;
					}
				
			}
				r=sum+",";	
				System.out.print(sum+",");
		}
		
				
			}
				
			

		
return r.substring(0, r.length()-1);
		
}
}