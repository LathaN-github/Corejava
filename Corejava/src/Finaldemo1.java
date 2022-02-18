
public class Finaldemo1 {
	final int a=10;
	final int b;
	 Finaldemo1()
	 {
		 b=13;
		 System.out.println(b);
		 
	 }
	 Finaldemo1(int c)
	 {
		 b=15;
		 System.out.println(b);
	 }

	public static void main(String[] args) {
		Finaldemo1 f1=new Finaldemo1();
		f1.display();
				

	}
	private void display() {
		// TODO Auto-generated method stub
		
	}

}
