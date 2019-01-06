// R:\Java Learning\CoreJavaClass\bin>java CommandLineArgumentsUsingStringArrayDemo2 100 sankar 55 101 Bala 65

// Run this program in command line
// Q. Create 2 Students of their htno,name % mark by using command line args?
public class CommandLineArgumentsUsingStringArrayDemo2 {
	
	public static void main(String[] arr){

		int htno1 = Integer.parseInt(arr[0]);
		String name1 = arr[1];
		double percentage1 = Double.parseDouble(arr[2]);
		
		int htno2 = Integer.parseInt(arr[3]);
		String name2 = arr[4];
		double percentage2 = Double.parseDouble(arr[5]);	
		
		System.out.println("Hall Ticket No : "+htno1+" Student Name : "+name1+" Percentage : "+percentage1+"%");
		
		System.out.println("Hall Ticket No : "+htno2+" Student Name : "+name2+" Percentage : "+percentage2+"%");
	}

	// output
//	Hall Ticket No : 100 Student Name : sankar Percentage : 55.0
//	Hall Ticket No : 101 Student Name : Bala Percentage : 65.0
}
