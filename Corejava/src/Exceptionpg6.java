
import java.io.*;
class Exceptionpg6 
{
	public static void findFile() throws IOException {

	       File newFile = new File("sample.txt");
	    FileInputStream stream = new FileInputStream(newFile);
	  }

	  public static void main(String[] args) 
	  {
		  try 
		  {
		      findFile();
		  }
		  catch (IOException e) 
		  {
		      System.out.println(e);
		  }
	  }
}
