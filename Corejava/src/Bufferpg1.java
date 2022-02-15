import java.io.*;
public class Bufferpg1 {

	public static void main(String[] args) throws Throwable {
		 FileReader fr=new FileReader("C:\\Users\\harshitha n\\Desktop\\Latha B10 C2TC\\sample.txt");    
         BufferedReader br=new BufferedReader(fr);    
 
         int i;    
         while((i=br.read())!=-1){  
         System.out.print((char)i);  
         }  
         br.close();    
         fr.close();    
   }   

	}

