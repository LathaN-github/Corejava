import java.util.LinkedList;
public class Stacklinkedlistpg6 {

	public static void main(String[] args) {
		LinkedList<Integer>st=new LinkedList<>();
		st.add(200);
		st.add(300);
		st.add(400);
		st.add(500);
		
		System.out.println(st);
		st.addFirst(100);
		System.out.println(st);
		st.addLast(600);
		st.set(2,700);
		
		System.out.println(st);// 

	}

}
