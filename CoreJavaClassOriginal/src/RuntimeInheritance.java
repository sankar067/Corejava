/*
 *Runtime inheritance - it is function/method overriding  
 * 
 * Re-implimentation/Re-defined parent class method/function in child class is called function overriding.
 * overriding is required when we need customization of existing parent method
 * 
 * Function Overloading
 * with in class
 * compile/ static polymorphism
 * 2 function must have same name different parameter and return type
 * 
 * function overriding
 * Between the class
 * runtime polymorphism / dynamic
 * 2 function must have same prototype(same name, input parameter and return type)
 * 
 * Function 
 */
class RuntimeParent {

	void f1(){
		System.out.println("parent ...");
	}

}
class RuntimeChild extends RuntimeInheritance{
	void f1(){
		System.out.println("Child ...");
	}
}

class RuntimeInheritance{
	
	public static void main(String[] args){
		RuntimeChild RC=new RuntimeChild();
		RC.f1();
	}
}