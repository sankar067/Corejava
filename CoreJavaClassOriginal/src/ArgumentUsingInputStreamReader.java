import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ArgumentUsingInputStreamReader {

	public static void main(String[] args) throws IOException {
		String num1,num2;
		//BufferredReader
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br =new BufferedReader(isr);
		
		System.out.println("Enter Number 1 : ");
				
			num1=br.readLine();

		System.out.println("Enter Number 2 : ");

			num2=br.readLine();
		
		int sum = Integer.parseInt(num1)+Integer.parseInt(num2);
		System.out.println("Print Sum : "+sum);
		br.close();
		isr.close();
	
		
		

		}
		
	}

