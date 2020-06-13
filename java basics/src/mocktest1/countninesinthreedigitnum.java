package mocktest1;

public class countninesinthreedigitnum {

	public static void main(String[] args) {
		int num = 589;
		int count=0;
		while(num>0) {
			int digit = num%10;
			if(digit==9)
				count++;
		}
		System.out.println(count);
}
}

