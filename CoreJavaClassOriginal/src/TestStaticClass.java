/* Static is applicable to 
-Variable
-Member Function
-Class
*/

// static can be accessed by both static an non static functions.
// non-static can't be accessible by static functions

class outer{
	
	static String country;
	
	// static block
	static{
		country="INDIA";
	}
	static class inner{ // inner class is 
		int x=100;
		void printx(){
			System.out.println("X value is :"+x);
		}
	}
	void test(){
		class A{
			int z=100;
		}
		A a= new A();
		System.out.println("z=="+a.z);
	}
}
public class TestStaticClass {

	static int counter; // Global Variable
	
	void function1(){
		System.out.println("Non Static Member Function");
	}
	
	static void function2(){
		System.out.println("Static Member Function");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestStaticClass tsf = new TestStaticClass();
		tsf.function1();
		tsf.function2(); // Accessing static function using class object 
		
		TestStaticClass.function2();   // Accessing static function using main class reference
		outer.inner inn = new outer.inner();
		inn.printx();
		outer o = new outer();
		o.test();
		
		//static block access
		System.out.println("Country is :"+outer.country);
		
	}
/*	Output
 * 
	Non Static Member Function
	Static Member Function
	Static Member Function
	X value is :100
	z==100
	Country is :INDIA
 */
}
