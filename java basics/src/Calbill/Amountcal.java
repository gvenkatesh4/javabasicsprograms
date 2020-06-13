package Calbill;

public class Amountcal implements total{
	data daaa;
	public Amountcal() {
		
	}
	public Amountcal(data daaa) {
		this.daaa=daaa;
		
	}

	@Override
	public double calamount() {
		
		double am = data.getProduct()*data.getQuantity();
		return am;
	}
	@Override
	public String toString() {
		return "Amountcal [daaa=" + daaa + ", calamount()=" + calamount() + "]";
	}

}
