package Stringpracticeprograms;

public class Stringisrotationalornot {

	public static void main(String[] args) {
		
		String str = "india";
		String str1 = str+str;
		
		String keystring = "ndiai";
		
		if(str1.contains(keystring)) {
			System.out.println("it is rotational string");
		}
		else
			System.out.println("it is not rotational string");
			
	}

}
