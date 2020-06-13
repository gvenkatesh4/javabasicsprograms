package assesmentsinscoremore;

public class CountnoofZeros {

	public static void main(String[] args) {
		int num = 1000;
		int digit;
		int evencount=0;
		int oddcount=0;
		while(num>0) {
			 digit=num%10;
			if(digit%2==1)
				oddcount++;
			else
				evencount++;
			num=num/10;
			}
		System.out.println(evencount);
		System.out.println(oddcount);
		
	}

}
