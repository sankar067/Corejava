/*
 * -- Interface --
 * the non-implemented class is called interface
 * create interface class by interface keyword
 * implements keyword will be used in interface implementation
 * 
 */
// making of car/bus engine
// here engine is common the way of making differs.

interface engine {
//	abstract method
	void make();
}

class volvo implements engine{
	public void make(){
		System.out.println("Making volvo engine");
	}
}

class toyota implements engine{
	
	public void make(){
		System.out.println("Making toyota engine");
	}
}

// kitchen is common for all Making dish is different for diff geo graphic location 

interface kitchen{
	void preparedish();
}

class italian implements kitchen{
	public void preparedish(){
		System.out.println("Pasta Preparation");
	}
}

class Indian implements kitchen{
	public void preparedish(){
		System.out.println("Thali Preparation");
	}
}
class InterfaceDemo{
	public static void main(String[] args){
		//Engine 
		volvo v= new volvo();
		v.make();
		toyota t = new toyota();
		t.make();
		//Kitchen
		italian i = new italian();
		i.preparedish();
		
		Indian I = new Indian();
		I.preparedish();
	}
}