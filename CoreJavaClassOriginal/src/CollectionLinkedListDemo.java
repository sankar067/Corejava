import java.util.Collections;
import java.util.Date;
import java.util.LinkedList;

/* * Collection
 * 
 * Java provides collection package  in java.util to add n number of elements in runtime.
 * which is dynamic in nature also we can dynamic array
 * elements can be different kind of data type (Heterogeneous)
 *  
 *  Basically collection divided in 3 categories
 *  
 *  - List 
 *  	- ArrayList
 *  	- LinkedList
 *  
 *  - Set
 *  	-HashSet
 *  	-TreeSet
 *  
 *  - Map
 *  	-HashMap
 *  	-TreeMap
 *  
 *  Legacy collections
 *  - HashTable
 *  - Vector
 *  
 *  Common operations in collection 
 *  - adding element
 *  - update element
 *  - Retrieving element
 *  - Removing element
 *  - Sorting element
 *    
 */
public class CollectionLinkedListDemo {

	void testList(){
		LinkedList ll= new LinkedList();
		// Adding
		ll.add(10);
		ll.add("pavan");
		ll.add(10.12);
		ll.add(new Date());
		System.out.println("No of Elelement : "+ll.size());
		
		System.out.println("-------------------");
		
		//Retrieve
		
		for(int i=0;i<ll.size();i++){
			System.out.println("Element in LinkedList: "+ll.get(i));
		}
		
		System.out.println("-------------------");
		
		//Updating
		ll.set(1, 99.45);
		ll.set(2, "Sankar");
		
		for(int i=0;i<ll.size();i++){
			System.out.println("After update Element in LinkedList: "+ll.get(i));
		}
		
		System.out.println("-------------------");
		
		//Updating
		ll.remove(1);
		ll.remove("Sankar");
		
		for(int i=0;i<ll.size();i++){
			System.out.println("After update Element in LinkedList: "+ll.get(i));
		}	
		System.out.println("-------------------");
		
		LinkedList ll1= new LinkedList();
		// Adding
		ll1.add("Sankar");
		ll1.add("pavan");
		ll1.add("Virat");
		ll1.add("Anushka");
		ll1.add("Dhoni");
	
		//Retrieve
		
		for(int i=0;i<ll1.size();i++){
			System.out.println("Befor Sort Element in LinkedList: "+ll1.get(i));
		}
		System.out.println("-------------------");
		
		Collections.sort(ll1);
		
		for(int i=0;i<ll1.size();i++){
			System.out.println("After Sort Element in LinkedList: "+ll1.get(i));
		}
		
	}
	public static void main(String[] args) {
	
		CollectionLinkedListDemo cld = new CollectionLinkedListDemo();
		cld.testList();

	}

}
