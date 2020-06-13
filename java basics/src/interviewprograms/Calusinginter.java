package interviewprograms;

interface cal{
	public void add();
}
public class Calusinginter implements cal {
	
	
int a  = 10;
	int b = 20;
	public void add() {
		int z = a+b;
		System.out.println(z);
	}

	public static void main(String[] args) {
		
		Calusinginter obj = new Calusinginter();
		obj.add();
	}
}
