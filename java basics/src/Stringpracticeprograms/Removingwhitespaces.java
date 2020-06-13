package Stringpracticeprograms;

public class Removingwhitespaces {

	public static void main(String[] args) {
		String x="ttt	reger yjyj s   k";
		String t1 = "venkat gmail.com";
		
		String t = "ven ka";
		String t2 = "venka";

		x = x.replaceAll("\\s","");
		t = t.replaceAll("\\s",",");
		t1 = t1.replaceAll("\\s","@");
		t2 = t2.replace("v","vvg");
		System.out.println();
		System.out.println(x);
		System.out.println(t);
		System.out.println(t1);
		System.out.println(t2);
	}

}
