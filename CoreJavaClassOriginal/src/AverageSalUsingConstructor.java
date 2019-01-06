/*
 * this 
 * 
 *  it always refers to current invoking object
 *  we can access properties and member functions
 *  we can't use on static context 
 *  
 */
public class AverageSalUsingConstructor {

	// instance variable
	int deptno;
	double salary;
	String name;
	

	AverageSalUsingConstructor(String name,int deptno,double salary) { // parameterize Constructor with 2 Params rectangle
		// TODO Auto-generated constructor stub
		
		this.deptno=deptno;
		this.salary=salary;
		this.name=name;
		
		System.out.println("parameterize Constructor with 3 Param- Name: "+ name + " deptno :"+ deptno +" and Salary : "+salary);
	} 

	void calculateaverage(double a,double b){
		double average= (a+b)/2;
		System.out.println("Average is : "+ average);
	}
	

	public static void main(String[] args){
	
	// Employee-1 details
	AverageSalUsingConstructor a1=new AverageSalUsingConstructor("Sankar", 101, 30011.50);
	//Employee-2 details
	AverageSalUsingConstructor a2=new AverageSalUsingConstructor("Bala", 102, 40020.50);
	
	a1.calculateaverage(a1.salary, a2.salary);
	
	double average= (a1.salary+a2.salary)/2;
	
	System.out.println("Average in main function : "+ average);
}
/*
 * 
parameterize Constructor with 3 Param- Name: Sankar deptno :101 and Salary : 30011.5
parameterize Constructor with 3 Param- Name: Bala deptno :102 and Salary : 40020.5
Average is : 35016.0
Average in main function : 35016.0

 */
}