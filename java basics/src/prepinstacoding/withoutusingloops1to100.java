package prepinstacoding;

public class withoutusingloops1to100 {

	public static void main(String[] args) {
		int num = 1;
		printnumbers(num);
	}
public static void printnumbers(int num) {
	if(num<100) {
		System.out.println(num);
		printnumbers(num+1);
	}
}
}
