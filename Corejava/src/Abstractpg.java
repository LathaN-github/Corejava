	abstract class bike{
		abstract void run();
	}
class Honda extends bike{
	public void run()
	{
		System.out.println("Honda bike is running sucessfully");
	}
}
public class Abstractpg {

	
	public static void main(String[] args) {
		Honda h=new Honda();
		h.run();
		
	}

}
