package cocubesprograms;

public class Salary {
public  static void main(String[] args) {
	
	int sal = 1600;
	if(sal<1500) {
		
		int hfc = sal*10/100;
		int da = sal*80/100;
		System.out.println(hfc);
		System.out.println(da);
		int grosssalary = sal+hfc+da;
		System.out.println("gross salary"+grosssalary);
	}
	else if(sal>1500)
	{
		int hfc1 = sal*20/100;
		int da1 = sal*90/100;
		System.out.println(hfc1);
		System.out.println(da1);
		int grosssalary1 = sal+hfc1+da1;
		System.out.println("gross salary"+grosssalary1);
		
			
		
		
	}
	
}
}
