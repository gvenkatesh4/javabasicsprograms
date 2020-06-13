package p;


interface calculation{
void cal();
}


public class Interfaceexampleprogram  implements calculation {

	
	public void cal() {
		int a  =5;
		int b = 10;
		int c = a*b;
		System.out.println(c);
		
	}
	
	
	
	public static void main(String args[]){
		Interfaceexampleprogram data = new Interfaceexampleprogram();
		data.cal();
		
		calculation d = new Interfaceexampleprogram();
		d.cal();
		
	}

	
	
	
	
}


