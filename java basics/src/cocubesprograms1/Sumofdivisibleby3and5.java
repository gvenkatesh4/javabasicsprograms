package cocubesprograms1;

public class Sumofdivisibleby3and5 {
	
	public static void main(String[] args) {
		
		int ha =1;
		int sa = 5;
		int sum = 0;
		for(int i =ha;i<=sa;i++) {
			if(i%3==0||i%5==0) {
				sum = sum+i;
			}
			
		}
		System.out.println(sum);
	}

}
