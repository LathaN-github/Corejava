import java.util.Scanner;

interface First {
    void input();
    void add();
}

class Interfaceadd implements First {

    int x, y, z;
    Scanner sc = new Scanner(System.in);

    public void input() {
        System.out.print("Enter two numbers:");
        x = sc.nextInt();
        y = sc.nextInt();
    }

    public void add() {
        z = x + y;
    }

    void display() {
        System.out.println("Sum is:" + z);
    }

    public static void main(String args[]) {
    	Interfaceadd t = new Interfaceadd();
        t.input();
        t.add();
        t.display();
    }
}

