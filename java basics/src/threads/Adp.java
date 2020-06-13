
package threads;

public class Adp {
	public static void main(String[] args) {
		

		Firex t = new Firex();
		//Thread t1 =new Thread(t);
		//Thread t2 =new Thread(t);
		Firex t1 = new Firex();

		
		t.start();
		t1.start();
	//	t2.start();
	}



}
