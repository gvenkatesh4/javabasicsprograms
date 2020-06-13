package p;

public class Overloadingcompiletmepolymorphism {
	
	
	void sum(int a,int b)
	{
		System.out.println(a+b);
    }
	void sum(int a,int b,int c) 
	{
		System.out.println(a+b+c);
	}
	
	public static void main(String[] args) {
		Overloadingcompiletmepolymorphism obj = new Overloadingcompiletmepolymorphism();
		obj.sum(10, 10,10);
		obj.sum(20, 50);
	}
}
