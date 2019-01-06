import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/*
 *  Object - It's super class of all classes
 *  
 * Take Example Banking Saving Account(SA) and Current Account(CA) and apply interest for both account
 * 
 */
class SA{
int acctno;
int roi;
}

class CA{
	int acctno;
	int roi;
}
class AA{
	int x;
}
public class TestObject {

	void applyRoi(Object o){
		if(o instanceof SA){
			SA sa =(SA)o;
			sa.roi=6;
		}
		if(o instanceof CA){
			CA ca=(CA)o;
			ca.roi=9;
		}
	}
	
	void avoidDuplicates(List<AA> emplist){
		System.out.println("size of employee arraylist  = "+emplist.size());
		Set empset = new HashSet(emplist);
		System.out.println("Size of employee using Hashset = "+empset.size());
	}
	
	public static void main(String[] args){
		SA sa=new SA();
		sa.acctno=9999;
		CA ca=new CA();
		ca.acctno=8888;
		
		TestObject TO = new TestObject();
		TO.applyRoi(sa);
		System.out.println("Rate of Interest SA... "+sa.roi);
		TO.applyRoi(ca);
		System.out.println("Rate of Interest CA... "+ca.roi);
		List<AA> emplist = new ArrayList<AA>();
		AA a1 = new AA();
		a1.x=400;
		emplist.add(a1);
		AA a2=new AA();
		a2.x=400;
		
		//each object is identified by hascode in memory
		System.out.println("Hash code od a1 "+a1.hashCode());
		System.out.println("Hash code od a1 "+a2.hashCode());
		
		//override hashcode() and equals to avoid duplicate Object
		//hashcode & equals methods are of object class
		//Methods overriding  and runtime inheritance(polymorphism)
		System.out.println(a1.equals(a2));
		System.out.println(a1==a2);
		emplist.add(a2);
		TO.avoidDuplicates(emplist);
	}
}
