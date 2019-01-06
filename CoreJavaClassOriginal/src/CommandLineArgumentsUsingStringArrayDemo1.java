//Run in command prompt
//R:\Java Learning\CoreJavaClass\bin>java CommandLineArgumentsUsingStringArrayDemo 10 20
public class CommandLineArgumentsUsingStringArrayDemo1 {

	public static void main(String[] arr){
			System.out.println("Length of array == " +arr.length);
			
			String Num1=arr[0];
			String Num2=arr[1];
			
//			int Sum=num1+num2; //error- num1 cannot be resolved to a variable
			
			int Sum=Integer.parseInt(Num1)+Integer.parseInt(Num2);// type casting
			System.out.println("Sum == "+Sum);
		}
		
//output
//	Length of array == 2
//			Sum == 30
	}
