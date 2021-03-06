

public class ExceptionTryCatchDemo {

	/*
	 * Try ... catch
	 * we can't write catch block without try block
	 * catch block will execute only when exception occurred
	 * we can write multiple catch block w.r.t single try block 
	*/
	
	public static void main(String[] args){
		int a=10, b=2,c;
		String s=null;
		/*
		 * In java null is special kind of reference 
		 * if we write default exception to handle exception then internally compiler will check all child class of exception hierarchy to handle 
		 * if we write exact exception in program which will increase the performance of the program as it will take less memory 
		 */
		try{
		c=a/b;
		s=s.substring(1, 2);
		System.out.println("C val is : "+c);
		System.out.println("substring : "+s);
		}
		// when b =0 then this exception will execute when b>o else null pointer exception exception will execute
		catch(ArithmeticException ae){
			System.out.println("b should be > 0"); 
		}catch(NullPointerException ne){
			System.out.println("s Should not be null.");
		}catch(Exception e){
			System.out.println("Exception Occurred");
		}
	}
	
}
