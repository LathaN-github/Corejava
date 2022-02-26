package corejava;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Listiteratorprg {

	public static void main(String[] args) {
		 List<String> names = new LinkedList<>();
	        names.add("Welcome");
	        names.add("To");
	        names.add("Industrial area");
	        names.add("Bidadi");
	       
	        ListIterator<String> namesIterator = names.listIterator();
	  
	      
	        while (namesIterator.hasNext()) {
	            System.out.println(namesIterator.next());
	        }
	  
	        
	        for (String s : names) {
	            System.out.println(s);
	        }
	    }


	}


