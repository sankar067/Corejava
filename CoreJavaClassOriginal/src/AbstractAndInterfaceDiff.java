/*
 * Abstract															Interface
 * 
 * -It has both implemented and non-implemented				- It has only non-implemented methods
 * methods													- We can't create object of interface
 * -Can't create object of abstract class					- Interface design used when there is no commonality
 * -abstract class design used when there is commonality 	- Implementation keyword used to interface abstract method.
 * -extends keyword used to abstract method implementation
 * 
 */

abstract class A5{
	abstract void f1();
	abstract void f2();
}
interface B5{
	void f1();
	void f2();
}

class AB5 implements B5{
	public void f1(){
		System.out.println("Hello F1");
	}

	public void f2() {
		System.out.println("Hello F2");
		
	}
}
class AB6 extends  A5{
	 void f1(){
		System.out.println("Hello abstract F1");
	}

	void f2() {
		System.out.println("Hello abstract F2");
		
	}
}
public class AbstractAndInterfaceDiff {
public static void main(String[] args){
	
	AB5 ab =new AB5();
	ab.f1();
	ab.f2();
	
	AB6 AB=new AB6();
	AB.f1();
	AB.f2();
}
}
