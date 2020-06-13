package patternprograms;

public class Stringreverseusingstringbuilderfunction {

	public static void main(String[] args) {
		String str = "automation";
		StringBuffer str2 = new StringBuffer();
		str2.append(str);
		str2=str2.reverse();
		System.out.println(str2);
		
	}

}
