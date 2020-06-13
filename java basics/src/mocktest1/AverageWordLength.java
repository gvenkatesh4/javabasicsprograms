package mocktest1;

public class AverageWordLength {

	public static void main(String[] args) {
		System.out.println(AverageWordLength.getAverageWordLength("Hi mom"));
		System.out.println(AverageWordLength.getAverageWordLength("hi everyone"));
		System.out.println(AverageWordLength.getAverageWordLength("how are you"));

	}

	public static int getAverageWordLength(String str) {
		if(str==null) {
			return -1;
		}
		if(str ==" ") {
			return 0;
		}
		int count=0;
		for(int i =0;i<str.length();i++) {
			if(str.charAt(i)!=' ') {
				count++;
			}
		}
		String [] word = str.split(" ");
		
		
		return count/word.length;

	}

}
