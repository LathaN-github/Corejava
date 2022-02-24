import java.util.LinkedList;

public class Linkedlistiterating {

	public static void main(String[] args) {
		
		        // Creating a linked list
		        LinkedList<String>names = new LinkedList<>();
		        names.add("latha");
		        names.add("harshi");
		        names.add("yogi");
		        System.out.println("LinkedList: " + names);

		        // Using forEach loop
		        System.out.println("Accessing linked list elements:");
		        for(String name: names) {
		            System.out.print(name);
		            System.out.print(", ");
		        }
		    }
		
	}


