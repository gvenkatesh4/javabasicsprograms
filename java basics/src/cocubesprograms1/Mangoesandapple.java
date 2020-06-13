package cocubesprograms1;

public class Mangoesandapple {
public static void main(String[] args) {
	int apple = 10;
	int mangoes= 20;
	
	int appri = 20;
	int mangopri = 5;
	
	int ap = apple*appri;
	int mp = mangoes*mangopri;
	
	
	if(mp>ap) {
		System.out.println("buy apples"+ap);
	}
	if(mp<ap) {
		System.out.println("sell apples its cost"+ap);
	}
	
}
}
