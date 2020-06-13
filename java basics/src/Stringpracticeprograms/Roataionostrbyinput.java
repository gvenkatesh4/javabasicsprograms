package Stringpracticeprograms;

public class Roataionostrbyinput {

	public static void main(String[] args) {
		String str = "venkatesh";
		
		int n = 2;
		
		int a = str.length()-n;
	int i = str.length();
		System.out.print(str.substring(a,i));
		System.out.print(str.substring(0,a));
		
		
		
		System.out.println("------");
		
		System.out.print(str.substring(n,i));
		System.out.print(str.substring(0,n));
		/*System.out.println("------");
		int a1 = str.length()-str.length()+1;
		
		System.out.println(str.substring(1,5));
		System.out.print(str.substring(0,a1));*/
	}

}
