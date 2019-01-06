import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

/*
 * Set:- Collections of elements
 * Iterator used to work with collection sets
 */
public class CollectionHashSetDemo {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//HashSet does not guarantee the order of elements.
		HashSet hs = new HashSet();
		hs.add(10);
		hs.add("pavan");
		hs.add(10.25);

		System.out.println(hs);
		
//		Iterator it =hs.iterator();
//		while(it.hasNext()){
//			System.out.println("Element : "+it.next());
//		}

		//LinkedHashSet order of elements as it entered
		LinkedHashSet hs1 = new LinkedHashSet();
		hs1.add(10);
		hs1.add("pavan");
		hs1.add(10.25);
		
		System.out.println(hs1);
		
		//TreeSet sorted order of elements
		TreeSet ts = new TreeSet();
		ts.add("Dog");
		ts.add("Appale");
		ts.add("cat");
		ts.add("Baal");
		
		System.out.println(ts);		
		


	}

}
