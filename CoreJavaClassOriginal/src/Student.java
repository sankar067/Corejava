class Student{
	/* Program without using member function 
	 *  create 2 student and print their marks in math and calculate average marks of 2 student?
	 */
	
int mark;
String subject;
String name;

// student member function
void students(){

}
public static void main(String[] arg){
	int average;
	//Student one
	Student st = new Student();
	st.name="sankar";
	st.subject="math";
	st.mark=71;

	//Student two
	Student st2= new Student();
	st2.name="Bala";
	st2.subject="math";
	st2.mark=70;
	average=(st.mark+st2.mark)/2;
	System.out.println("Student 1 name:" +st.name+" Marks:" + st.mark);
	System.out.println("Student 2 name:" +st2.name+" Marks:" + st2.mark);
	System.out.println("Average Math Marks:" + average);
	
	/*
	 * Output
	 * 
	 	Student 1 name:sankar Marks:71
		Student 2 name:Bala Marks:70
		Average Math Marks:70
	 */
}
}