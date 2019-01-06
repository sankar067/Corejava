/* Subtyping Polymorphism
The three classes, String, Integer and LinkedList are subclasses of Object. 
Therefore, the function print can receive, as actual parameters, objects that are instances of any of these three classes.
*/
import java.util.LinkedList;
 public class Sub {
    public static void print(Object o) {
      System.out.println(o);
    }
    public static void main(String[] a) {
      print(new String("dcc024"));
      print(new Integer(42));
      print(new LinkedList<Integer>());
   }
 }