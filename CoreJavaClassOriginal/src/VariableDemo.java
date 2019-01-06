class Students{
	//Students class is Abstract Class
	int HallTicketNo;
	String Name;
	String College;
	static String collagename="BPUT";
}

public class VariableDemo {
	
	// instance variable (Object)
	int z; 
	int Counter;
	
	//Global Variable
	/*
	 *  By Using 'static' declare global Variable 
	 *  Or static variables are called global variable
	 *  Global variables also called as class variable
	 */
	static int Counter1;

	void print(){
		
		//local variable
		int x=30;
		System.out.println("x Value is : "+x);
	}
	
	void incrementCounter(){
		Counter+=1;
		System.out.println("Counter = "+Counter);
		
		Counter1+=1;
		System.out.println("Counter1 = "+Counter1);
	}
	
	public static void main(String[] args){
		
		VariableDemo vd1 = new VariableDemo();
		vd1.z=444;
		System.out.println("Value of Instance Variable (Object) z is :" +vd1.z);		
		vd1.incrementCounter(); // output will be 1	for Counter and Counter1	
		
		VariableDemo vd2 = new VariableDemo();
		vd2.z=555;
		System.out.println("Value of Instance Variable (Object) z is :" +vd2.z);
		vd2.incrementCounter(); // output will be 1 for Counter is due to Counter is not global, Counter1 will be 2
		
		Students st= new Students();
		st.Name="Sankar";
		st.College="BPUT";

		Students st2= new Students();
		st2.Name="Tikina";
		st2.College="BPUT";
				
		Students st3= new Students();
		st3.Name="Achary";
		st3.College="BPUT";		

		System.out.println("Name and College name of St :"+ st.Name+" , "+st.College);
		System.out.println("Name and College name of St2 :"+ st2.Name+" , "+st2.College);
		System.out.println("Name and College name of St3 :"+ st3.Name+" , "+st3.College);
		
	/* In above 3 students college is same for college declare college name as global,
	 * so we can reduce reduce line of code 
	 * Declare as below in class
	 * static String collagename="BPUT";
	 */
		Students st4= new Students();
		st4.Name="Aditya";

		Students st5= new Students();
		st5.Name="Chita";
			
		Students st6= new Students();
		st6.Name="Babuji";

		
		System.out.println("Name and College name of St :"+ st4.Name+" , "+Students.collagename);
		System.out.println("Name and College name of St2 :"+ st5.Name+" , "+Students.collagename);
		System.out.println("Name and College name of St3 :"+ st6.Name+" , "+Students.collagename);
		
		/*
		 *output 
		 * Value of Instance Variable (Object) z is :444
			Counter = 1
			Counter1 = 1
			Value of Instance Variable (Object) z is :555
			Counter = 1
			Counter1 = 2
			Name and College name of St :Sankar , BPUT
			Name and College name of St2 :Tikina , BPUT
			Name and College name of St3 :Achary , BPUT
			Name and College name of St :Aditya , BPUT
			Name and College name of St2 :Chita , BPUT
			Name and College name of St3 :Babuji , BPUT
		 */
		
	}
}
