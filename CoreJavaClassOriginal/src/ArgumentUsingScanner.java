import java.util.Scanner;

public class ArgumentUsingScanner {

	public static void main(String[] args) {
		int num3, num4;
		Scanner sc = new Scanner(System.in);
		try{
				
		System.out.println("Enter Number 3 : ");
		num3=sc.nextInt();	

		System.out.println("Enter Number 4 : ");
		num4=sc.nextInt();	

		System.out.println("Print Sum : "+(num3+num4));
		sc.close();
		}catch(Exception e){
		sc.close();
		}
				

		}
		
	}

