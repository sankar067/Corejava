/*
 * Difference bet ween this and super
 * 
 * By using super can access variable, member function/ method and constructor of immediate parent class.
 * By using this can access variable, member function/ method and constructor of same class/with in the class.
 */

class A4{
	int x=100;
	void print(){
		System.out.println("X val is "+this.x);  // o/p- x val is 100
	}
}

class B4 extends A4{
	int x=200;
	
	//Constructor
	public B4(){
		super();
		System.out.println("Constructor of B4..");
	}
	//Method
	void print(){
		System.out.println("x val is "+this.x);  // o/p- x val is 200
		System.out.println("X val from parent "+super.x); // o/p - X val from parent 100
	}
}

class C4 extends B4{
	int x=300;
	// constructor
	public C4(){
		super();
		System.out.println("Constructor of C3");
	}
	//method
	void print(){
		System.out.println("x val is "+this.x);           // o/p-x val is 300
		System.out.println("X val from parent "+super.x); // o/p- X val from parent 200
	}
}
public class MultiLebelInheritanceUsingSuper {

	public static void main(String[] args){
		
		// below class object invoke parent class constructor B2 which immediate parent of C3 
		C4 c = new C4();
		c.print();
		
		// below class object invoke parent class constructor A2 which immediate parent of B2
		B4 b = new B4();
		b.print();	
		
		A4 a =new A4();
		a.print();
	}
}
/*
 * out put
 * 
 * Constructor of B2..
Constructor of C3
x val is 300
X val from parent 200
Constructor of B2..
x val is 200
X val from parent 100
X val is 100
*/
