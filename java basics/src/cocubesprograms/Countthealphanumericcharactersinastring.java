package cocubesprograms;

public class Countthealphanumericcharactersinastring {

	public static void main(String[] args) {
		String str = "i lov emyindia74&487&";
		
		char [] ch = str.toCharArray();
		int letter = 0;
		int space = 0;
		int number = 0;
		int other = 0;
		for(int i =0;i<str.length();i++) {
			if(Character.isLetter(ch[i])) {
				letter++;
			}
			else if(Character.isDigit(ch[i])){
				number++;
			}
			else if(Character.isSpaceChar(ch[i])){
				space++;
			}
			else
				other++;
		}
			System.out.println(letter);
			System.out.println(number);
			System.out.println(space);
			System.out.println(other);
	

}
}
