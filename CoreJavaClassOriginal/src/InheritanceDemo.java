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
class InheritanceParent {

	void f1(){
		System.out.println("parent...");
	}
}

class InheritanceChild extends InheritanceParent{
void f2(){
	System.out.println("child...");
}
}
class InheritanceDemo{
	
public static void main(String[] args){
	//parent class we can't access child class
	InheritanceParent a1=new InheritanceParent();
	a1.f1();
	//in child class we can access parent class
	InheritanceChild b1=new InheritanceChild();
	b1.f1();
	b1.f2();
	
	/*
	 * output
	 * 	parent...
		parent...
		child...

	 */
}
}