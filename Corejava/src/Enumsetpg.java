package corejava;

import java.util.EnumSet;
import java.util.Set;

import java.util.Iterator;

public class Enumsetpg {
	enum days {  
		  SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY  
		}  
	public static void main(String[] args) {
		 
		
		 
		 
		    Set<days> set = EnumSet.of(days.TUESDAY, days.WEDNESDAY);  
		    // Traversing elements  
		    Iterator<days> iter = set.iterator();  
		    while (iter.hasNext())  
		      System.out.println(iter.next());  
		   
		 
		

	}

}
