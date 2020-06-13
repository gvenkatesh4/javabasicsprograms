package Calbill;

public class data {

	private int item;
	private static int product;
	private static int quantity;
	
	
	data(){
		
	}
	 data(int item,int product,int quantity ) {
		this.item=item;
		this.product=product;
		this.quantity=quantity;
		
	}
	
	protected int getItem() {
		return item;
	}
	protected void setItem(int item) {
		this.item = item;
	}
	protected static int getProduct() {
		return product;
	}
	protected void setProduct(int product) {
		this.product = product;
	}
	protected static int getQuantity() {
		return quantity;
	}
	protected void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		return "data [item=" + item + ", product=" + product + ", quantity=" + quantity + "]";
	}
	
	

}
