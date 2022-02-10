
public class Overloading {
	void addition(int a,int b,int c) {//m1
		System.out.println("Result:"+(a+b+c));
	}
	void addition(int a,int b,double c) {//m2
	}
	void addition(int a,int b,int c,int d) {//m3
		System.out.println("Result:"+(a+b+c+d));
	}
	/*void addition(int a,int b,int c,int d,int e) {//m4
		System.out.println("Result:"+(a+b+c+d+e));
	}*/
	void addition(int a,int b) {//m5
		System.out.println("Result:"+(a+b));
	}	
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Overloading ol=new Overloading();
		ol.addition(2,5);//m5
		//ol.addition(2,5,5,3,2);//m4
		ol.addition(2,5,5,6);//m3
	}

}
