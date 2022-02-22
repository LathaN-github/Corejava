import java.io.IOException;  
class Throwdemo2{  
  void m()throws IOException{  
    throw new IOException("device error");//checked exception  
  }  
  void n()throws IOException{  
    m();  
  }  
  void p(){  
   try{  
    n();  
   }catch(IOException e){System.out.println("exception handled");}  
  }  
  public static void main(String args[]){  
   Throwdemo2 obj=new Throwdemo2();  
   obj.p();  
   System.out.println("normal flow...");  
  }  
}  