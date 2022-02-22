
import java.util.*;
class WeightLimitExceeded extends Exception{
	static void WeightLimitExceeded(int x)
	{
		System.out.println(Math.abs(15-x)+"kg:");
	}
}
public class Exceptionpg5 {
		static void validWeight(int weight) throws ArithmeticException {
		if(weight>15)
		throw new ArithmeticException();
		else
		System.out.println("You are ready to fly!");
		}
		public static void main (String[] args) {
			
		Exceptionpg5 ob=new Exceptionpg5();
		Scanner in=new Scanner(System.in);
		System.out.println("Enter x:");
		System.out.println("Enter weight:");
		int x=in.nextInt();
		int y=in.nextInt();
		 WeightLimitExceeded. WeightLimitExceeded(x);
		for(int i=0;i<2;i++){
		try{
		Exceptionpg5.validWeight(in.nextInt());
		}catch(ArithmeticException e){
		System.out.println(e);
		}
		}
		}
		}
