import java.util.*;

public class IteratorDemo {

	public static void main(String[] args) {
	
		ArrayList<String> a1 = new ArrayList<String>();
		
		a1.add("C");
		a1.add("B");
		a1.add("A");
		a1.add("D");
	

		ListIterator<String> litr = a1.listIterator();
		
		System.out.println("Original Content : a1");	
		while(litr.hasNext()){
			String element = litr.next();
			System.out.println(element +" ");
		}
		
		System.out.println("Backword Content : a1");
		// Backward print
		
		while(litr.hasPrevious()){
			String element = litr.previous();
			System.out.println(element);
		}
		
		System.out.println("For each Content : a1");
		//for-each alternative to iterator
		for(String s : a1){
			System.out.println(s+" ");
		}
	}

}
