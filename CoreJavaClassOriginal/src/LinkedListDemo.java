import java.util.HashSet;
import java.util.LinkedList;

/*
 * We can remove duplicates from linked calling object Hashset
 */
public class LinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList names = new LinkedList();
		names.add("sachin");
		names.add("pavan");
		names.add("sankar");
		
		HashSet hs = new HashSet(names);
		System.out.println("Hash List : "+hs);

	}



}
