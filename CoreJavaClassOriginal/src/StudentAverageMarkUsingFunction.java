	/* Program using member function
	 *  create 2 student and print their marks in math and calculate average marks of 2 student?
	 */
public class StudentAverageMarkUsingFunction {
String name;
int mark;

// To declare global function, declare as static. No need to create object to access the function in main function
static void average(){
	
	System.out.println("Global Function average()");
	StudentAverageMarkUsingFunction stam1= new StudentAverageMarkUsingFunction();
	stam1.name="Sankar";
	stam1.mark=70;

	StudentAverageMarkUsingFunction stam2= new StudentAverageMarkUsingFunction();
	stam2.name="Bala";
	stam2.mark=60;
	int avg=(stam1.mark+stam2.mark)/2;
	System.out.println("Student 1 name:" +stam1.name+" Marks:" + stam1.mark);
	System.out.println("Student 2 name:" +stam2.name+" Marks:" + stam2.mark);
	System.out.println("Average Math Marks:" + avg);
}
 void average2(){
	
	 System.out.println("Instance Function average2()");
	StudentAverageMarkUsingFunction stam1= new StudentAverageMarkUsingFunction();
	stam1.name="Ram";
	stam1.mark=30;

	StudentAverageMarkUsingFunction stam2= new StudentAverageMarkUsingFunction();
	stam2.name="shiva";
	stam2.mark=35;
	int avg=(stam1.mark+stam2.mark)/2;
	System.out.println("Student 1 name:" +stam1.name+" Marks:" + stam1.mark);
	System.out.println("Student 2 name:" +stam2.name+" Marks:" + stam2.mark);
	System.out.println("Average Math Marks:" + avg);
}
public static void main(String[] args){
	
	// Instance Function
	StudentAverageMarkUsingFunction fn = new StudentAverageMarkUsingFunction();
	fn.average2();
	
	// Global function
	average();
}
/*output
Instance Function average2()
Student 1 name:Ram Marks:30
Student 2 name:shiva Marks:35
Average Math Marks:32
Global Function average()
Student 1 name:Sankar Marks:70
Student 2 name:Bala Marks:60
Average Math Marks:65
 */
}
