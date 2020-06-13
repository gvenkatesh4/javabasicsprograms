package mocktest1;

public class Countninesinjava {

	public static void main(String[] args) {
		int count=0;
		
		int num = 79;
		int num1 = 99;
		
		for(int i = num;i<=num1;i++) {
			int digi = i%10;
		    int digit = i/10;
			if(digit==9) {
				count++;
			}		
			 if(digi==9) {
				 count++;
			 }
		}
		
		
		
		System.out.println(count);

		}

		
}


