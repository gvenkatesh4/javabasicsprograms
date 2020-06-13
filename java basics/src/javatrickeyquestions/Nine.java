package javatrickeyquestions;

public class Nine {

	public static void main(String[] args) {

		System.out.println(Math.min(Double.MIN_VALUE, 0.0d));
		System.out.println(Math.min(Integer.MIN_VALUE, 0.0d));
		
		long longwithl = 1000*60*24*365*892148*8965L;
		long longwithoutL = 1000*60*24*365*892148*8965;
		
		System.out.println(longwithl);
		System.out.println(longwithoutL);

	}

}
