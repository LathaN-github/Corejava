import java.util.LinkedList;
import java.util.Queue;

public class Linkedlistqueuepg {

	public static void main(String[] args) {
		Queue<String> names=new LinkedList<>();
		names.add("latha");
		names.add("harshi");
		names.add("yogi");
		names.add("charvi");
		System.out.println("Stack names:"+ names);
		

	    // access the first element
	    String str1 =names.peek();
	    System.out.println("Accessed Element: " + str1);

	    // access and remove the first element
	    String str2 = names.poll();
	    System.out.println("Removed Element: " + str2);
	    System.out.println("LinkedList after poll(): " + names);

	    // add element at the end
	    names.offer("Srinidhi");
	    System.out.println("LinkedList after offer(): " + names);
		
	

	}

}
