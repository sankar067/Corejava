

/*
 * 2 Types of thread
 * - Daemon thread (system defined which can't kill)
 * - User Defined Thread
 * 
 * Life cycle of thread
 * --------------------
 * 					 								New
 * 					 								 | start()
 * 	Block(sleep/suspend() and Resume())				Run           wait(wait() and notify())
 * 													 | stop()
 * 												    Dead
 * Thread Attributes
 * -------------------
 * -ID
 * -Name
 * -State
 * -Priority
 * 
 * Java provides a mechanism to write own threads
 * 
 * In java we can write 2 ways 
 * - extend Thread class
 * - Implements Runnable interface
 * 
 * Java by default provides priority Thread is 5, Max is 10 & Min 1
 * Servelt is multi-thread 
 */
public class ThreadDemo extends Thread{

	public ThreadDemo(){}
	
	public void run(){
		System.out.println("ID= "+Thread.currentThread().getId());
		System.out.println("Name= "+Thread.currentThread().getName());
		System.out.println("Priority= "+Thread.currentThread().getPriority());
		System.out.println("State= "+Thread.currentThread().getState());
		System.out.println("ID= "+Thread.currentThread().isInterrupted());
	}
	public static void main(String[] args) throws Exception {
	
		ThreadDemo tm = new ThreadDemo();
		Thread t1 = new Thread(tm,"one");
		Thread t2= new Thread(tm,"two");
		
		t1.start();
		t1.sleep(5000);
		t2.start();
		t2.suspend();

		ThreadDemo tm1 = new ThreadDemo();
		Thread t3 = new Thread(tm1,"three");
		
		t3.start();
		t2.resume();
		t2.setPriority(8);
	}

}
