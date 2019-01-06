/*
 * this 
 * 
 *  it always refers to current invoking object
 *  we can access properties and member functions
 *  we can't use on static context 
 *  
 */
public class AreaProgUsingConstructor {

	double a,b,area; // instance variable
	

	public AreaProgUsingConstructor(double a) { // parameterize Constructor with 1 Param for square
		// TODO Auto-generated constructor stub
		
		this.a =a;
		System.out.println("parameterize Constructor with 1 Param Square "+a); 
	} 
	
	public AreaProgUsingConstructor(double a,double b) { // parameterize Constructor with 2 Params rectangle
		// TODO Auto-generated constructor stub
		
		this.a=a;
		this.b=b;
		
		System.out.println("parameterize Constructor with 2 Param Rectangle "+a + " and "+b);
	} 

	void calAreaSquare(double a){
		this.area= a*a;
		System.out.println("Area Of Square: "+ area);
	}
	
	void calAreaRectangle(double a,double b){
		this.area= a*b;
		System.out.println("Area Of Rectangle: "+ area);
	}
	
	public static void main(String[] args){
	
	AreaProgUsingConstructor a1=new AreaProgUsingConstructor(10);
	a1.calAreaSquare(a1.a);
	
	AreaProgUsingConstructor a2=new AreaProgUsingConstructor(40,20);
	a2.calAreaRectangle(a2.a,a2.b);
	
	AreaProgUsingConstructor a3=new AreaProgUsingConstructor(10.3,20.4);
	a2.calAreaRectangle(a3.a,a3.b);
}
/*
 * 
parameterize Constructor with 1 Param Square 10.0
Area Of Square: 100.0
parameterize Constructor with 2 Param Rectangle 40.0 and 20.0
Area Of Rectangle: 800.0
parameterize Constructor with 2 Param Rectangle 10.3 and 20.4
Area Of Rectangle: 210.12
 */
}