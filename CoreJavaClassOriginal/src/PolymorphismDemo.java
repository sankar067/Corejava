/*
 * Polymorphism:- Many Forms
 * 
 * exception : platypus -> its reptile but having mammal character(which gives milk)
 * 
 * polymorphism is 3 type
 * - universal - 2 type 1) parametric 2) subtyping(Animal.java and sub.java)
 * -static/compile time
 * -dynamic/run time
 * 
 * 1)parametric
 * using Generic Type which allows Collections to hold any type of object at run time without any change in code and 
 * this has been achieved by passing actual Type as parameter. 
 * 
 *  
 * eg: + is used for addition as well as concatenation.
 * In terms of number + used for addition
 * In terms of string + used as concatenation operator. 
 * 
 * static
 * -with in the class
 * -function/method overloading
 * 
 * static rules
 * -2 Function/method same name
 * -2 functions must have different in either number of arguments or datatype arguments
 * 
 * Difference between function and constructor
 * -Constructor doesn't have return type
 * -function/method have return type
 * 
 */

public class PolymorphismDemo {

	double pi=3.14;
	double volume;
	
	void volume(int r){
		volume= (4/3)*pi*(r*r*r);
		System.out.println("Volume of Sphere:"+volume);
	}
	
	void volume(int r,int h){
		volume= pi*(r*r)*h;
		System.out.println("Volume of cylinder:"+volume);
	}

	public static void main(String[] args) {
		// TODO Auto-generated constructor stub
		PolymorphismDemo p = new PolymorphismDemo();
		p.volume(5);
		p.volume(5, 6);
	}
/*
 * Volume of Sphere:392.5
Volume of cylinder:471.0
 */
}
