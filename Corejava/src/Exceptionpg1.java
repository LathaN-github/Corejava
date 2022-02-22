import java.util.*;
public class Exceptionpg1 {

	public static void main(String[] args) {
		try {
			int data=5/0;
		}catch(ArithmeticException e) {System.out.println(e);}
		
		
		System.out.println("end of program!");

	}
}


