
public class ConstructorChainingDemoBook {

	String title, author;
	int price;
	
	public ConstructorChainingDemoBook(){
		System.out.println("DC .... ");
	}
	
	public ConstructorChainingDemoBook(String title){
		this();
		this.title=title;
		System.out.println("PC ... 1 PARAM");
	}
	
	
	public static void main(String[] args){
		ConstructorChainingDemoBook book= new ConstructorChainingDemoBook("java book");
		System.out.println("Book Title: "+book.title);
	}
}
