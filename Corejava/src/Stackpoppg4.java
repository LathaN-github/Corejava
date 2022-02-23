import java.util.Stack;

public class Stackpoppg4 {

	public static void main(String[] args) {
		Stack<Integer>st=new Stack<>();
	        st.push(10);
	        st.push(15);
	        st.push(30);
	        st.push(20);
	        st.push(5);
	 
	        // Displaying the Stack
	        System.out.println("pushed Stack: " + st);
	 
	        // Removing elements using pop() method
	        System.out.println("Popped element: " +st.pop());
	                                         
	        System.out.println("Popped element: " +st.pop());
	        
	        System.out.println("popped element:" +st.pop());
	                                         
	 
	        // Displaying the Stack after pop operation
	        System.out.println("Stack after pop operation: "+ st);
	                                             
	    }
	

	}


