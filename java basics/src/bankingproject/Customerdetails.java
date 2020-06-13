package bankingproject;


public class Customerdetails {

	public static void main(String[] args) {
		String name = "venkatesh";
		int Acno = 12345;
		double AcBal = 50000;
		
		Deposit(AcBal);
		Withdraw(AcBal);
	}
		
			 static double Deposit(double AcBal) {
				
			int depositamount=2000;
			 double AcBal1 = AcBal+depositamount;
			 double acd = AcBal1;
		System.out.println(AcBal1);
			return AcBal1;
			
			
			
		}
			 static void Withdraw(double AcBal1) {
			 double acbal;
				double withdraw=10000;

				if(withdraw<AcBal1) {
			acbal= (AcBal1-withdraw);
			
			System.out.println(acbal);
				}
				if(withdraw>AcBal1) {
					System.out.println("Insufficinent Balance");
				}
			}
			
			
	
		
}

