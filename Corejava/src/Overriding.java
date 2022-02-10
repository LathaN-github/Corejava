
public class Overriding extends A {//child
	int a=2;//declaring and intializing
	int b=3;
	int c;
	
	void sum() {
		c=a+b;
		System.out.println("Result:"+ c);
	
	}
		void multiplication(int a,double b) {//parent
			System.out.println("parent result of multiplication:"+(a*b));
			System.out.println("hello child");
			
		}
		void display() {
			System.out.println("hello child");	
		}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Overriding od=new
Overriding();
		
		od.sum();
		od.multiplication(3,2);
		A a=new A();
		a.display();
		od.display();
		od.multiplication(2,8.0);//declare in class A which is parent class
	}
	
}
class A{
	void multiplication(int a,double b) {
		System.out.println("parent result of multiplication:"+(a*b));
	}
	void display() {
		System.out.println("hello parent");	
	}
		
				
	}


