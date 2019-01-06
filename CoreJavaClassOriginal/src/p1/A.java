/**
 * 
 */
/**
 * @author SANKAR
 *
 *package is collection of classes
 *we can create package by using package keyword
 *package name starts with lower case
 *package acts as name space(Java package removes naming collision)
 *package provides access protection
 *
 *Access Modifier -> it is the permission for member function/method to access outside the package
 *there are 4 modifier type
 *1)private
 *2)protected
 *3)default package
 *4)public
 *
 */
package p1;

public class A{
	
	private void f1(){
		System.out.println("Function F1...");
	}
	protected void f2(){
		System.out.println("Function F2...");
	}
	public void f3(){
		System.out.println("package p1 Function F3...");
	}
}

