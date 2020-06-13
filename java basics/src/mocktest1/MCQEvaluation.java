package mocktest1;


public class MCQEvaluation {

	public static void main(String[] args) {
		
		System.out.println(MCQEvaluation.evaluate(new char[]{'a','b','c','d','a','b','c','d','a'}, new char[]{'a','b','b','d','a','b','c','b','a'}));
		System.out.println(MCQEvaluation.evaluate(new char[]{'a','b','c','d','a','b','c','d','a'}, new char[]{'a','b','b','d','a','b','a'}));	

	}
	
		
	public static int evaluate(char[] attempt, char[] key){
		int count=0;
		if(attempt.length!=key.length) {
			return -1;
		}
		for(int i=0;i<attempt.length;i++) {
			for(int j=0;j<key.length;j++) {
				if(i==j) {
					if(attempt[i]==key[j]) {
						count++;
					}
				}
			}
		}
		
		
		
		
		return count*2;
		
		
		
	}
}
