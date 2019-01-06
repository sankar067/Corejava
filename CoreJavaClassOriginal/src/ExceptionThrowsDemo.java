/*
 * It's only applicable to method/member function
 * 
 */
public class ExceptionThrowsDemo {

	void Readfile(){
		try{
			System.out.println("open file to read.. Reading...");
			String S=null;
			S=S.substring(1, 2);
			System.out.println("close file in try");
			return; // return should be end statement in method/member function
		}
		catch(Exception e){
			System.out.println("close file in catch");
		}
		finally{
			/*
			 * finally block will execute if there exception is there or not. 
			 * if you having requirement like closing db connection, server connection and server resources(files)
			 */
			System.out.println("close file in finally");
		}
	}

	public static void main(String[] args){
		ExceptionThrowsDemo et = new ExceptionThrowsDemo();
		et.Readfile();
	}
}
