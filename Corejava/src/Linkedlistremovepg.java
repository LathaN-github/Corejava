import java.util.LinkedList;

public class Linkedlistremovepg {

	public static void main(String[] args) {
		
		    LinkedList<String> names = new LinkedList<>();

		    // add elements in LinkedList
		    names.add("harshitha");
		    names.add("latha");
		   names.add("yogitha");
		   names.add("charvi");
		    System.out.println("LinkedList: " +names);

		    // remove elements from index 1
		    String str =names.remove(1);
		    System.out.println("Removed Element: " + str);

		    System.out.println("Updated LinkedList: " + names);
		  }
	

	}


