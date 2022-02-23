import java.util.Stack;

public class Stacksearchpg5 {

	public static void main(String[] args) {
		
		Stack<String> stk= new Stack<>();  
		//pushing elements into Stack  
		stk.push("Latha");  
		stk.push("Harshitha");  
		stk.push("Yogitha");
		stk.push("Charvi");

		
		System.out.println("Stack: " + stk);  
		// Search an element  
		int location = stk.search("Harshitha");  
		System.out.println("Location of Yogitha : " + location);  
		}  
		

	}


