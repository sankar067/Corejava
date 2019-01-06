/*function overriding 
 * Overriding is required when customization of existing parent method
 * 
 * Examples of function overriding 
 * 1)any type of loan
 * As per RBI loan rate which is same for all banks (which is can't be customized)
 * But bank's can customized loan interest rate with addons for there customer.
 * 
 * 2) Car
 * Car any part can be customized but engine can't be customized
 * 
 */
class Appartment {

	void getkitchen(){
		System.out.println("Default Indian Style...");
	}
	
	// as per example amenities is generic for apartment which can't be customized
	void getamenities(){
		System.out.println("No Option : Gym,Swmming Pool,Kids park etc..");
	}
}

class flatno1 extends Appartment{
	//in this class where getkitchen customized 
	void getkitchen(){
		
		System.out.println("Malasian Style...");
	}
}

class flatno3 extends Appartment{
	//in this class where getkitchen customized 
	void getkitchen(){
		
		System.out.println("Vertified Style...");
	}
}

public class RuntimePolymorphism{
	public static void main(String[] args){
		
		//Parent class
		Appartment a= new Appartment();
		a.getkitchen();
		a.getamenities();
		
		//child calss1 appratment
		Appartment f1 = new flatno1();		
		f1.getkitchen();
		f1.getamenities();
		
		// child class2 of appratment
		Appartment f3 = new flatno3();
		f3.getkitchen();
		f3.getamenities();
		
		// Runtime- below statements called Dynamic Dispatch method(DDM)
		System.out.println("\n Runtime DDM \n");
		
		Appartment r; // r is called polymorphic variable
		
		Appartment a1= new Appartment();
		r=a1;
		r.getkitchen();   //ouput--Default Indian Style...
		
		flatno1 nf1=new flatno1();
		r=nf1;
		r.getkitchen();
		r.getamenities(); 
				
	}
}