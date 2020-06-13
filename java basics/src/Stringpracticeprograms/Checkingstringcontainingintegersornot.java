package Stringpracticeprograms;

public class Checkingstringcontainingintegersornot {

	public static void main(String[] args) {
		String x = "12345";
		int size = x.length();
		
		int i  = 0;
		while(i!=size) {
			if(x.charAt(i)>='0'&&x.charAt(i)<='9') {
				i++;
			}
			else
			{
				System.out.println("string was not containing integers");
				System.exit(0);
			}
			
		}
		System.out.println("it is integer string");

	}

}
