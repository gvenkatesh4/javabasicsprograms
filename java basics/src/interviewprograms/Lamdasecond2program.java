package interviewprograms;

interface calculation {
	
	
	int  cal(int a,int b);
}

public class Lamdasecond2program {

	public  static void main(String[] args) {
		
		 calculation ad1=(a,b)->(a+b);  
	        System.out.println(ad1.cal(10,20));  
		
	        calculation ad2=(a,b)->(a+b);  
	        System.out.println(ad2.cal(100,200));  
			
		}
		
	}
	

