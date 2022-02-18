
public class Multithreadpg2 extends Thread
{
	public void run()
	{
		System.out.println("running thread name is:"+Thread.currentThread().getName());
	}
	

	public static void main(String[] args) {
		Multithreadpg2 t1=new Multithreadpg2();
		Multithreadpg2 t2=new Multithreadpg2();
		System.out.println("t1 thread priority:"+t1.getPriority());
		System.out.println("t2 thread priority:"+t2.getPriority());
		t1.start();
		t2.start();

	}

}
