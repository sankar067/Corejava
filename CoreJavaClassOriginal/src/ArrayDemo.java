/*
 * Array
 * To store more than one value we use array.Array's can declare in 2 ways
 * 
 * datatype variable[];
 * datatype[] variable;
 * 
 * e.g
 * int nos[];
 * String[] str;
 * 
 * Limitation of array-->
 * we need to provide size of the declared array.
 * Array's static means we have initialize size of array.
 * Array's are homogeneous(same kind of element or data type)
 * 
 */
public class ArrayDemo {
static int nos[]={10,20,30};
static String[] str ={"sankar","Bala","Ram"};


	public static void main(String[] args) {
		double[] dob = new double[3];
		dob[0]=10.22;
		dob[1]=20.32;
		dob[2]=30.42;
//		dob[3]=31.42; //Eception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 3
		
		for(int i=0;i<str.length;i++){
			System.out.println("Value of String Array: "+ str[i]);
		}
		for(int i=0;i<nos.length;i++){
			System.out.println("Value of String Array: "+ nos[i]);
		}
		for(int i=0;i<dob.length;i++){
			System.out.println("Value of String Array: "+ dob[i]);
		}
	}

}
