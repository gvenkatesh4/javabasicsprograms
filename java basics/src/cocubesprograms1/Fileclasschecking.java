package cocubesprograms1;

public class Fileclasschecking {
	public static void main(String[] args) {
		String str = "abc.java";
		String str1 = "aabd.java";
		
		if(str.endsWith(".java")&&str1.endsWith(".class")) {
			System.out.println("Two are java files");
		}
		else
			System.out.println("not java files");
		
	}

}
