package p;



interface print{
void pr();
}
 class Inter   implements print {

	public void pr() {
		System.out.println("HEllo");
		
	}

	public static void main(String args[]) {
		Inter obj = new Inter();
		obj.pr();
	}
}
