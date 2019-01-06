/*
 * this 
 * 
 *  it always refers to current invoking object
 *  we can access properties and member functions
 *  we can't use on static context 
 *  
 */
public class ConstructorClassUsingThis {

	int x,y; // instance variable
	
	public ConstructorClassUsingThis() {
		// TODO Auto-generated constructor stub
		System.out.println("Default Constructor");
	}

	public ConstructorClassUsingThis(int x) { // parameterize Constructor with 1 Param 
		// TODO Auto-generated constructor stub
		System.out.println("parameterize Constructor with 1 Param ");
		// x=x1; // it's not recommended 
		this.x =x;
	} 
	
	public ConstructorClassUsingThis(int x,int y) { // parameterize Constructor with 2 Param 
		// TODO Auto-generated constructor stub
		System.out.println("parameterize Constructor with 2 Param ");
//		x=x1;
//		y=y1;// it's not recommended to pass different param (x1 and y1) from class 
		this.x=x;
		this.y=y;
	} 

public static void main(String[] args){
	
	ConstructorClassUsingThis a;
	a= new ConstructorClassUsingThis(); // Invoke Constructor
	
	ConstructorClassUsingThis a1=new ConstructorClassUsingThis(10);
	System.out.println("X val of a1 "+a1.x);
	
	ConstructorClassUsingThis a2=new ConstructorClassUsingThis(40,20);
	System.out.println("X val of a2 "+a2.x+" ,Y val of a2 "+a2.y);
}
/*
 * Default Constructor
parameterize Constructor with 1 Param 
X val of a1 10
parameterize Constructor with 2 Param 
X val of a2 40Y val of a2 20

 */
}