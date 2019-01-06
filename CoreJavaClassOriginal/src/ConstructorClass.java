/*
 * Object 
 * 
 *  Declaration - Memory is not allocated at the time of declaration of object
 *  Creation - create object using new operator
 *  Initialization-Constructor's are used to initialize the instance  variables of class
 *  
 *  
 *  Constructor
 *  
 *  Constructor is 2 type 1) Default 2) parameterize
 *  Constructor must be same name of class
 *  It can be accessed by only new operator
 *  whenever constructor invoked then the memory allocated to object
 *  By default default constructor is available in class
 *  constructed are not inherited 
 *  
 */
public class ConstructorClass {

	int x,y; // instance variable
	
	public ConstructorClass() {
		// TODO Auto-generated constructor stub
		System.out.println("Default Constructor");
	}

	public ConstructorClass(int x1) { // parameterize Constructor with 1 Param 
		// TODO Auto-generated constructor stub
		System.out.println("parameterize Constructor with 1 Param ");
		x=x1;
	} 
	
	public ConstructorClass(int x1,int y1) { // parameterize Constructor with 2 Param 
		// TODO Auto-generated constructor stub
		System.out.println("parameterize Constructor with 2 Param ");
		x=x1;
		y=y1;
	} 

public static void main(String[] args){
	
	ConstructorClass a;
	a= new ConstructorClass(); // Invoke Constructor
	
	ConstructorClass a1=new ConstructorClass(10);
	System.out.println("X val of a1 "+a1.x);
	
	ConstructorClass a2=new ConstructorClass(40,20);
	System.out.println("X val of a2 "+a2.x+"Y val of a2 "+a2.y);
}
/*
 * Default Constructor
parameterize Constructor with 1 Param 
X val of a1 10
parameterize Constructor with 2 Param 
X val of a2 40Y val of a2 20

 */
}