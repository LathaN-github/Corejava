
public class Multithreadpg1 extends Thread {
	public void run() {
		System.out.println("task one");
		
	}

	public static void main(String[] args) {
		Multithreadpg1 p1=new Multithreadpg1();
		Multithreadpg1 p2=new Multithreadpg1();
		Multithreadpg1 p3=new Multithreadpg1();
		
		p1.start();
		p2.start();
		p3.start();
		
		
		
		
		
	}

}
