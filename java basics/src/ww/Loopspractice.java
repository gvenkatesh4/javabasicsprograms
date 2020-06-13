package ww;

public class Loopspractice {

	public static void main(String[]args) {
		
		int result = 0;
		
		//myouterloop;
		for(int x = 1;x<=10;x++) {
			
			for(int y= 1;y<=5;y++) {
				result++;
				
				if(x==5) {
					break ;
				}
			}
		}
		System.out.println(result);
	}
}
