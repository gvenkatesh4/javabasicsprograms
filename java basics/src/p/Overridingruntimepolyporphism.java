package p;

class shape{
	void draw() {
		System.out.println("drawing");
	}
}
	class Rectangle extends shape{
		void draw() {
			System.out.println(" Rectangle drawing");
		}
		}
		class Circle extends shape{
			void draw() {
				System.out.println(" Circle drawing");
			}
}






public class Overridingruntimepolyporphism {
	
public static void main(String[] args) {		
	
	 shape s;
	 s= new Rectangle();
	 s.draw();
	 s= new Circle();
	 s.draw();
}
}


