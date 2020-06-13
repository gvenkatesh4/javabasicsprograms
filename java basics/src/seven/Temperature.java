package seven;
import java.util.Scanner;
import java.util.*;

public class Temperature {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float fahern;
		float cel;
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the fahern heat");
		fahern = scan.nextFloat();
		System.out.println("enter the cel");
		cel = scan.nextFloat();
		
		 
		float celsius = (float)(fahern-32)*5/9;
		System.out.println("fahern is"+celsius);
		
		
		float fah = (float)(cel*9)/5+32;
		
		System.out.println("cel is"+fah);

	}

}
