/*-- Abstract--
 * it is applicable for member function/methods and class
 * abstract function may and may not have any body
 * if a class is having at least one abstract function then class should set to abstract class
 * we can't create object for abstract class
 * 
 * 
 */

abstract class TestAbs{
	void f1(){
		System.out.println("Member Fuction with full implemention..");
	}
	void f2(){} // zero implementation
	
//	void f3(); // no-body(non-Implimentation) // This method requires a body instead of a semicolon
	
	abstract void f3();
	
}

class circle{
	void draw(){
		System.out.println("Draw circle");
	}
	void calArea(){
		System.out.println("calculate circle area");
	}
}

class rectangle{
	void draw(){
		System.out.println("Draw rectangle");
	}
	void calArea(){
		System.out.println("calculate rectangle area");
	}
}
public class AbstractDemo {

	public static void main(String[] args){
		
//	TestAbs t=new TestAbs(); // error- Cannot instantiate the type TestAbs
	
	circle c = new circle();
	c.draw();
	c.calArea();
	
	rectangle r = new rectangle();
	r.draw();
	r.calArea();
	
	
}
}
