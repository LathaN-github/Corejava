
public class Accessmodifier {
	int nos;
	int hrs;
	int noc;
	void displayStudents() {
		System.out.println("Number of Students");
		
	}
	void displayHours() {
		System.out.println("Number of Hours");
	}
	void displayClass() {
		System.out.println("Number of Class");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Accessmodifier am = new Accessmodifier();
		am.displayHours();
	}
	
}
