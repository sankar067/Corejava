/*
 * There is no multiple inheritance in java but we can achieve by interface
 */
interface i1{
	void f1();
}
interface i2{
	void f2();
}
interface i3{
	void f3();
}
class mi implements i1,i2,i3{
	public void f1(){
		System.out.println("From interface i1");
	}
	public void f2(){
		System.out.println("From interface i2");
	}
	public void f3(){
		System.out.println("From interface i3");
	}
}

class g1 extends mi implements i3{
	//here f3 overridden f3
	public void f3(){
		System.out.println("Test MI ...");
	}
}
public class MultipleInheritanceDemo {

	public static void main(String[] args){
		g1 g =new g1();
		g.f1();
		g.f2();
		g.f3();
		mi mio=new mi();
		mio.f1();
		mio.f2();
		mio.f3();
	}
}
