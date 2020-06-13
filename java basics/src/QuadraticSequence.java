public class QuadraticSequence {

	public static void main(String[] args) {
		System.out.println(QuadraticSequence.getQuadricSequence(10));

	}

	public static String getQuadricSequence(int n) {
		
		if(n<=0)
		{
			return null;
		}
		String result="";
		int sum=0;

		for(int i=1;i<=n;i++)
		{		
			

			sum=sum+i;
			System.out.print(sum+" ");
			

			

	
		}
			return result;
	}
}