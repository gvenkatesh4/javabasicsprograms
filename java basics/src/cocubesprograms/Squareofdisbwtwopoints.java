package cocubesprograms;

public class Squareofdisbwtwopoints {

	public static void main(String[] args) {
		int x1 = 1;
		int y1 = 1;
		int x2 = 4;
        int y2 = 4;
		
		double dis = Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
		
		double dissquare = dis*dis;
		System.out.println(dis);
		System.out.println(dissquare);

	}

}
