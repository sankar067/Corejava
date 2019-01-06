/*
 * Difference bet ween this and super
 * 
 * By using super can access variable, member function/ method and constructor of immediate parent class.
 * By using this can access variable, member function/ method and constructor of same class/with in the class.
 */

class A2{
	int x=100;
	void print(){
		System.out.println("X val is "+this.x);  // o/p- x val is 100
	}
}

class B2 extends A2{
	int x=200;
	void print(){
		System.out.println("x val is "+this.x);  // o/p- x val is 200
		System.out.println("X val from parent "+super.x); // o/p - X val from parent 100
	}
}

class C2 extends B2{
	int x=300;
	
	void print(){
		System.out.println("x val is "+this.x);           // o/p-x val is 300
		System.out.println("X val from parent "+super.x); // o/p- X val from parent 200
	}
}
public class MultiLebelInheritance {

	public static void main(String[] args){
		C2 c = new C2();
		c.print();
		B2 b = new B2();
		b.print();	
		
		A2 a =new A2();
		a.print();
	}
}
