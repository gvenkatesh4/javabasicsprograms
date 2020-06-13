package cocubesprograms;

public class Frequencyofcharactersinastring {

	public static void main(String[] args) {
		String str = "i love my india";
		str = str.toLowerCase();
		char c = 'i';
		int count = 0;
		for(int i =0;i<str.length();i++) {
			if(c == str.charAt(i)) {
				count++;
			}
		}
		System.out.println(count);

	}

}
