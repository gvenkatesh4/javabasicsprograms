//package mocktests;

public class SixthStarPattern {
		public static String getStars(int n){
			String result = "";
			if(n<=0)
				return "Error";
			int i,j;
			for(i=1;i<=n;i++)
			{
				for(j=1;j<=i;j++)
				{
					System.out.print("*");
					
				}
				System.out.println();
				
			}
			for(i=1;i<=n;i++)
			{
				for(j=i;j<=n-1;j++) {
					
					System.out.print("*");
				}
					System.out.println();
			}
			
			
		return result;
		}
		public static void main(String[] args) {
			System.out.println(getStars(10));
		}
	

}
