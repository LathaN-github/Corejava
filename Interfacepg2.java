// create an interface
interface Language {
  void getName(String name);
}

// class implements interface
class Programinglanguage implements Language {

  // implementation of abstract method
  public void getName(String name) {
    System.out.println("Programming Language: " + name);
  }
}

class Interfacepg2 {
  public static void main(String[] args) {
	  Programinglanguage i= new Programinglanguage();
    i.getName("Java");
  }
}


