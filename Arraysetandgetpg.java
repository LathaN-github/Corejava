import java.util.ArrayList;

public class Arraysetandgetpg {

	public static void main(String[] args) {
		
		  ArrayList<String> al=new ArrayList<String>();  
		  al.add("latha");  
		  al.add("harshi");  
		  al.add("yogi");  
		  al.add("charvi");  
		  //accessing the element    
		  System.out.println("Returning element: "+al.get(1));//it will return the 2nd element, because index starts from 0  
		  //changing the element  
		  al.set(1,"srinidhi");  
		  //Traversing list  
		  for(String name:al)    
		    System.out.println(name);    
		  
		 }  
		
	}


