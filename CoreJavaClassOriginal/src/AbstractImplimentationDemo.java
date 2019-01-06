/*
 * Instead writing multiple class for circle,square and rectangle as AbstarctDemo.java
 * create generic code for circle,square etc.
 */

	abstract class shape{
		void draw(String Type){
			System.out.println("Draw :"+Type);
		}
		abstract void calArea();
	}

	class circles extends shape{
		final double pi=3.14;
		double area;
		int r=10;
		// Implement abstract method 
		void calArea(){
			area=pi*(r*r);
			System.out.println("Circle Area :"+area);
		}
	}
	
	class square extends shape{
		double area;
		int a= 21;
		// Implement abstract method 
		void calArea(){
			area=a*a;
			System.out.println("Rectangle Area :"+area);
		}
	}
public class AbstractImplimentationDemo {

	public static void main(String[] args){
		shape h;
		h= new circles();
		h.draw("circle");
		h.calArea();
		h=new square();
		h.draw("Square");
		h.calArea();
	}

}
