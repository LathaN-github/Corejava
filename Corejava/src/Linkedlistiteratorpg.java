package corejava;

import java.util.LinkedList;

import java.util.Iterator;

public class Linkedlistiteratorpg {

	public static void main(String[] args) {
		
			
				// TODO Auto-generated method stub
				LinkedList<String> al=new LinkedList<String>();  
				  al.add("Latha");  
				  al.add("Harshi");  
				  al.add("Yogi");  
				  al.add("Charvi");  
				  
				  Iterator<String> itr=al.iterator();  
				  while(itr.hasNext()){  
				   System.out.println(itr.next());  
				  }  
			}

		


	}


