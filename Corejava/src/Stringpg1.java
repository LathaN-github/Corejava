
public class Stringpg1 {

	public static void main(String[] args) {
		//1 st string
		String s="Hello";
		System.out.println("print 1 st string:"+ s);
		System.out.println("Length of 1 st string:"+ s.length());
		
		//2 nd string
		String s1=new String("world");
		System.out.println("print 2 nd string:"+ s1);
		s.concat(s1);
		System.out.println("concat 1 st & 2 nd string:"+ s);
		
		//join two string
		String s2=s.concat(s1);
		System.out.println("Concat 1 st and 2 nd string:"+ s2);
		
		//3 rd string
		String s3="Hello";
		System.out.println("print 1 st string:"+ s3);
		
		//4 th string
		String s4="HELLO";
		System.out.println("print 1 st string:"+ s4);
		
		if(s==s3)
		{
			System.out.println("print s=s3");
		}
		else
		{
			System.out.println("print S=!S3");
		}
			
					
				
		
				
				
				
		
		


		
	}

}
