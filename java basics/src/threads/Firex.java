package threads;

public class Firex  extends Thread{


	public void run() {
		m1();
	}
	
	public void m1() {
		
		
		for(int i = 0;i<15;i++) {
			try {
				Thread.sleep(100);
			}catch (InterruptedException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			System.out.println(i);
		}
	}

	
		
	



}