/*
 * custom exception's defined by user
 * throw used for custom exception
 */

// myException extends RuntimeException{ - when we write RuntimeException we will get error during execution(Unchecked Error)
// myException extends Exception{ - when we write Exception we will get error while compile(Checked Error)
class myException extends RuntimeException{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public myException(String S){
		System.out.println("String ... "+S);
	}
}
public class CustomExceptionDemo {

	public static void main(String[] args){
		int a=10,b=0,c;
		String S = null;
		if(b==0){
			throw new myException("b should be >0");
		}
		if(S==null){
			throw new myException("S should be not null");
		}
	}
}
