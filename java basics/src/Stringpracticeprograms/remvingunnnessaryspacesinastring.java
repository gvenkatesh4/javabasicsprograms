package Stringpracticeprograms;

import java.util.StringTokenizer;

public class remvingunnnessaryspacesinastring {

	public static void main(String[]args) {
		
		String str = "jack  is      from America";
		StringTokenizer st =  new StringTokenizer(str," ");
		StringBuffer sb = new StringBuffer();
		while(st.hasMoreElements()) {
			sb.append(st.nextElement()).append(" ");
		}
		//System.out.println(sb.toString().trim());
		System.out.println(sb);
	}
}
