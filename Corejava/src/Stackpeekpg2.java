import java.util.Stack;

public class Stackpeekpg2 {

	public static void main(String[] args) {
		
		Stack<String> stk= new Stack<>();  
		// pushing elements into Stack  
		stk.push("Latha");  
		stk.push("Harshitha");  
		stk.push("Yogitha");  
		stk.push("Charvi");
		stk.push("Srinidhi");
		System.out.println("Name: " + stk);  
		// Access element from the top of the stack  
		String names = stk.peek();  
		//prints stack  
		System.out.println("Name at top: " + names);   
		}  
		

	}


