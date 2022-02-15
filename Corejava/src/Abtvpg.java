abstract class tv{
	abstract void run();
	
}
class onida extends tv{
	public void run()
	{
		System.out.println("welcome to onida");
	}
}
class LG extends tv{
	public void run()
	{
		System.out.println("welcome to LG");
	}
}
public class Abtvpg {

	public static void main(String[] args) {
		onida o=new onida();
		LG L=new LG();
		o.run();
		L.run();

	}

}
