package mcqpractice;

public class First {
	public static void main(String[] args) {
int bunnies=4;
		
	System.out.println(bunnyEars(bunnies));	
	}
	public static int bunnyEars(int bunnies) {
		if(bunnies==0)
			return 0;
		else if(bunnies%2==0)
			return bunnyEars(bunnies-1);
		else
			return 2+bunnyEars(bunnies-1);
		

	}
	}

