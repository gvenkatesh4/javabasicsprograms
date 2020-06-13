package Extracoding;


public class ECC_63_AverageWordLength {

	public static void main(String[] args) {
		System.out.println(ECC_63_AverageWordLength.getAverageWordLength("Hi mom"));
		System.out.println(ECC_63_AverageWordLength.getAverageWordLength("hi everyone"));
	}

	public static int getAverageWordLength(String str) {

		if(str==null)
			return -1;
		if(str== " ")
			return 0;
		String[] word=str.split(" ");

		return word.length;
		
	}

}
