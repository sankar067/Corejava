/* Static is applicable to 
-Variable
-Member Function
-Class
*/
public class TestStaticFunction {

	static int counter; // Global Variable
	
	void function1(){
		System.out.println("Non Static Member Function");
	}
	
	static void function2(){
		System.out.println("Static Member Function");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestStaticFunction tsf = new TestStaticFunction();
		tsf.function1();
		tsf.function2(); // Accessing static function using class object 
		
		TestStaticFunction.function2();   // Accessing static function using main class reference
		
	}
/*	Output
 * 
	Non Static Member Function
	Static Member Function
	Static Member Function
 */
}
