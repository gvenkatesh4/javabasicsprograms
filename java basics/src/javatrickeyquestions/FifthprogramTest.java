package javatrickeyquestions;

interface IFruit{
	public String TYPE = "Apple";
}

class Fruit implements IFruit{
	
}

public class FifthprogramTest{
	
	public static void main(String[] args) {
		System.out.println(Fruit.TYPE);
	}
}