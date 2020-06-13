package cocubesprograms;

public class Countthenoofdigits149atlast {

	public static void main(String[] args) {
		int s = 90;
		int h = 100;
		
		for(int i =s;i<=h;i++) {
			
			int digit = i%10;
			if(digit==1||digit==4||digit==9) {
				System.out.println(i);
			}
		}
		}

	}


