package threads;

public class Infosis extends Maq {

public static void main(String[] args) {
		

		Thread t44 = new Thread(new Oracle());

		Thread t4 = new Thread(new Maq());

		t44.start();
		t4.start();
		


	}



}
