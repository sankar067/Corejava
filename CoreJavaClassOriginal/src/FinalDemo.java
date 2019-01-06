/*
 * Final - It is applicable for variable, Method/member function and class
 * 
 * Final variable is called constants
 * Final methods are can't be overridden.
 * Final class can't be inherited
 * 
 * e.g.
 * 
 * String class is final class
 */

class A3{
	final int x=100;
	final void print(){
		System.out.println("X val is "+this.x);  // o/p- x val is 100
	}
	
	void print1(){
		System.out.println("X val is "+this.x);  // o/p- x val is 100
	}
}

final class B3 extends A3{
	int x=200;
	
	//Constructor
	public B3(){
		super();
		System.out.println("Constructor of B2..");
	}
	//Method - Cannot override the final method from A3	
	void print(){
		System.out.println("x val is "+this.x);  // o/p- x val is 200
		System.out.println("X val from parent "+super.x); // o/p - X val from parent 100
	}
}

// The type C3 cannot subclass the final class B3
// As above class declared as final we can't inherit -it will show error
class C3 extends B3{
	int x=300;
	// constructor
	public C3(){
		super();
		System.out.println("Constructor of C3");
	}
	//method
	void print(){
		System.out.println("x val is "+this.x);           // o/p-x val is 300
		System.out.println("X val from parent "+super.x); // o/p- X val from parent 200
	}
}

final class D3 extends A3{
	int x=200;
	
	//Constructor
	public D3(){
		super();
		System.out.println("Constructor of B2..");
	}
	//Method - Cannot override the final method from A3	
	void print1(){
		System.out.println("x val is "+this.x);  // o/p- x val is 200
		
		//the final field A3.x cannot be assigned
		super.x=x;
		System.out.println("X val from parent "+super.x); // o/p - X val from parent 100
	}
}
 
public class FinalDemo {

	
	
}
