/*
 * there are 4 ways to take command line arguments
 * 1) Using String[] at command line
 * 2) Using DataInputString
 * 3) Using InputStreamReader
 * 4) Using java.util.scanner.class 
 */
public class CommandLineArgumentsUsingStringArrayDemo {

	public static void main(String[] arr){
		System.out.println("Length of array == " +arr.length);
	}
	
	//out put(Run without passing parameter then it will return zero size array) 
	//Length of array == 0 
}

