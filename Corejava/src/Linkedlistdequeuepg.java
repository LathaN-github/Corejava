import java.util.Deque;
import java.util.LinkedList;

public class Linkedlistdequeuepg {

	
		  public static void main(String[] args){
		    Deque<String> names = new LinkedList<>();

		    // add element at the beginning
		    names.add("latha");
		    System.out.println("LinkedList: " + names);

		    names.addFirst("harshi");
		    System.out.println("LinkedList after addFirst(): " + names);

		    // add elements at the end
		    names.addLast("yogi");
		    System.out.println("LinkedList after addLast(): " + names);

		    // remove the first element
		    names.removeFirst();
		    System.out.println("LinkedList after removeFirst(): " + names);

		    // remove the last element
		   names.removeLast();
		    System.out.println("LinkedList after removeLast(): " + names);
		  }
	

	}


