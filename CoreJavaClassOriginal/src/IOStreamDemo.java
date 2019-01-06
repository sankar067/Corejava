import java.io.DataInputStream;
import java.io.IOException;

/*
 * Stream  :- Flow of chars
 * 
 * Processing of string is expensive because our system is binary processing so each char will convert a value(ASCII).
 * java.io package to work with input and output streams.
 * 
 * 		Input Stream							Output Stream
 * 	------------------						----------------------
 *   DataInputStream							PrintStream
 *   FileInputStream							FileOutputStream
 *   CharacterInputSteream						CharacterOutputStream
 *   ObjectInputStream							ObjectOutputStream
 *   
 *   Steps:
 *   ------
 *   1) Create I/O handlers(Connector)
 *   2) Assign I/O resources to handlers (system.in means Keyboard)
 *   3) Process the data
 *   3) close the handler
 *   
 *   e.g
 *   Input					output
 *   -----					------
 *   Keyboard			 File-> Storage Structure
 *   File				Attributes-
 *   					-Name
 *   					-Type
 *   					Size
 *   					Last Modified
 *   					Created
 *   					Accessed
 */
public class IOStreamDemo {

	public static void main(String[] args) {
		DataInputStream dis = new DataInputStream(System.in);
		System.out.println("Enter Num1 .. ");
		String Num1;

		try {
			Num1 = dis.readLine();
			System.out.println("Enter Num2 .. ");
			String Num2 = dis.readLine();
			int Num = Integer.parseInt(Num1) + Integer.parseInt(Num2);
			System.out.println("Sum  : " + Num);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				dis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
