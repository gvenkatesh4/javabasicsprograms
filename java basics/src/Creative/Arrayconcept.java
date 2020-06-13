package Creative;
import java.util.Scanner;
public class Arrayconcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter the name");
		System.out.println("enter the phone number");
		System.out.println("enter the salary");
String str = null;
System.out.println("emp name is"+name(str));
int no = 0;
System.out.println("emp no is"+phno(no));

		
				
		

	}
public static String name(String str) {
	
	
	Scanner scan = new Scanner(System.in);
	String name=scan.nextLine();
	
return name;	
}
public static int phno(int no) {
	
	Scanner scan = new Scanner(System.in);
	int phno=scan.nextInt();
	return phno;
}


	
	
}
