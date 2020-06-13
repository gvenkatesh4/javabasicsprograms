package Extracoding;


public class ECC_68_SpinningString {

	public static void  main(String[] arg) {
		System.out.println(ECC_68_SpinningString.rotate("talent", 1));
		System.out.println(ECC_68_SpinningString.rotate("talent", 2));
		System.out.println(ECC_68_SpinningString.rotate("talent", 3));
		
		
	}

	public static String rotate(String str, int no_of_positions) {
		
		int a = str.length()-no_of_positions;
		int i = str.length();
		System.out.println(str=str.substring(a,i));
		System.out.println(str=str.substring(0,a));
		return str;
	}
}
