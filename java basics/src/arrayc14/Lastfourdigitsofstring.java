package arrayc14;

public class Lastfourdigitsofstring {

	public static void main(String[] args) {
		String input = "123456789";     
		String lastFourDigits = "";     
		 
		if (input.length() > 4) 
		{
		    lastFourDigits = input.substring(input.length() - 4);
		} 
		else
		{
		    lastFourDigits = input;
		}
		 
		System.out.println(lastFourDigits);

	}

}
