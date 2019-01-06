/*
 * Inheritance - extends keyword used for inheritance
 * -it is one of the technique to reuse the software/program
 * -it 'is a' relationship
 *e.g.
 *   A is a parent of B
 *   B is a child of A
 *   
 *   - parent <- child or super <- sub or base <- derived type
 *   
 *   parent	super	base
 *      ^	  ^		  ^
 *      |	  |		  |
 *    child	 sub	derived
 *    
 *   -in child class we can access parent class but we can't access child class in parent class 
 *   -or we can assign super type to sub type but vice versa not possible directly
 *   			
 *   -we can type cast super to sub type is called downward casting
 *   -upward casting is not possible 
 *   
 *   there are 3 type of inheritance
 *   - single label(label=2)
 *   -multi label(label>2)
 *   -multiple 
 *   
 *   there is hybrid inheritance 
 *   
 *   more usability is multiple inheritance
 */
class InheritanceParent1 {

	void f1(){
		System.out.println("parent...");
	}
}

class InheritanceChild1 extends InheritanceParent1{
void f2(){
	System.out.println("child...");
}
}
class InheritanceTypeCasting{
	
public static void main(String[] args){
	//parent class we can't access child class
	InheritanceParent1 a1=new InheritanceParent1();
	
	//in child class we can access parent class
	InheritanceChild1 b1=new InheritanceChild1();
	
	a1=b1;
//	b1=a1; we can assign once
	b1=(InheritanceChild1)a1; // Conversion of data type is called type casting
	b1.f1();
	b1.f2();
	
	/*
	 * output
	 * 
		parent...
		child...

	 */
}
}