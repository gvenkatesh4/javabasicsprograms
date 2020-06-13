package cocubesprograms;

public class Sumofnthnumber {
public static void main(String[] args) {
	
	int n = 2;
	int m = 10;
	
	int sum  = 0;
	for(int i =n;i<=m;) {
		
		sum = sum+i;
		i = i+2;
	}
	System.out.println(sum);
	
}
}
