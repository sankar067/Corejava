import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Vector;

public class CollectionDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		ArrayList al = new ArrayList();
		al.add("item1");
		al.add("item2");
		al.add("item3");
		al.add("item4");
		
		System.out.println(" ArrayList Size : "+al.size());		

		for(int i=0;i<al.size();i++){
			System.out.println(" ArrayList Value : "+al.get(i));		
		}
		
		Collections.reverse(al);
		
		System.out.println("ArrayList in Reverse order "+al);
		
		LinkedList<String> ll = new LinkedList<String>();		
		ll.add("item5");
		ll.add("item6");
		ll.add("item7");

		System.out.println(" LinkedList Size : "+ll.size());		

		for(int i=0;i<ll.size();i++){
			System.out.println(" LinkedList Value : "+ll.get(i));		
		}
		
		System.out.println("----- LinkedList 2 option -----");		

		for(String a: ll){
			System.out.println(" LinkedList Value : "+a);
		}
	
		System.out.println("----- ----- -----");	
		
		HashSet<String> hs = new HashSet<String>();
		hs.add("item8");
		hs.add("item9");
		hs.add("item10");
	
		System.out.println(" HashSet : "+hs);	
		
		System.out.println("----- HashSet 1 option -----");	
		
		System.out.println(" HashSet Size : "+hs.size());		

		for(String a: hs){
			System.out.println(" HashSet Value using for each : "+a);
		}
		System.out.println("----- HashSet 2 option -----");	
		
		Iterator<String> li = hs.iterator();
		
		while(li.hasNext()){
			System.out.println("Hashset value using while and Iterator : "+li.next());
		}
		
		TreeSet<String> ts = new TreeSet<String>();
		ts.add("item11");
		ts.add("item12");
		ts.add("item13");
	
		System.out.println("----- TreeSet 1 option -----");	
		
		System.out.println(" TreeSet Size : "+hs.size());		

		for(String a: ts){
			System.out.println(" TreeSet Value using for each : "+a);
		}
		
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(1,"item14");
		hm.put(2,"item15");
		hm.put(3,"item16");
		System.out.println("----- TreeSet 1 option -----");	
		
		System.out.println(" HashMap : "+hm);
		
		System.out.println(" HashMap Size : "+hm.size());		

		System.out.println(" HashMap Remove Element 2 : "+hm.remove(2));
		
		for(String a: hm.values()){
			System.out.println(" HashMap Value Keys : "+a);
		}	
		
		TreeMap tm = new TreeMap();
		tm.put(1,"item17");
		tm.put(2,"item18");
		tm.put(3,"item19");
		System.out.println("----- ----- -----");	
		
		System.out.println(" TreeMap  : "+tm);
		
		System.out.println(" TreeMap Size : "+tm.size());		

		System.out.println(" TreeMap Remove Element 2 : "+tm.remove(2));
		
		for(Object a: tm.values()){
			System.out.println(" TreeMap Value Keys : "+a);
		}		
		Hashtable<Object,Object> ht = new Hashtable<Object, Object>();
		ht.put(1,"item20");
		ht.put(2,"item21");
		ht.put("test","item22");

		System.out.println("----- ----- -----");	
		
		System.out.println(" Hashtable  : "+ht);
		
		System.out.println(" Hashtable Size : "+ht.size());		

		System.out.println(" Hashtable Remove Element  : "+ht.remove("test"));
		
		for(Object a: ht.values()){
			System.out.println(" Hashtable Value Keys : "+a);
		}		
		Vector<String> v = new Vector<String>();
		v.add(0, "Item23");
		v.add(1, "Item24");
		v.add(2, "Item25");
		System.out.println("----- ----- -----");	
		
		System.out.println(" Vector  : "+v);
		
		System.out.println(" Vector Size : "+v.size());		

		System.out.println(" Vector Remove Element  : "+v.remove(0));
		
		for(int i=0;i<v.size();i++){
			System.out.println(" Vector Value : "+v.get(i));		
		}
		System.out.println(" Vector  : "+v);


	}

}
