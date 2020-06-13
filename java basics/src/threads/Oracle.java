
package threads;

public class Oracle  implements Runnable{

	
	public void run() {
		m1();
	}
	
	public void m1() {
		for(int i = 0;i<20;i++) {
			try {
				Thread.sleep(1000);
			}catch (InterruptedException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			System.out.println(i);
		}
	}

	
	
		
	



}