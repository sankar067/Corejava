/*
 * Recursion-Function calling itself 
 * 
 * Q: Write program find factorial of number
 */
public class ArrayProgramUsingRecursion {

	static int fact(int n){
		if(n<=1){
			return 1;
		}else{
			return n*fact(n-1);
		}
	}
	public static void main(String[] args) {
		int fact = fact(6);
		System.out.println(" Factorial of 6 is : "+fact);
	}

}
