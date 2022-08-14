import java.util.*;

class Exception
{
  public static void main(String arg[])

  {
	int ans = 0,no1 = 0,no2 =0;
    Scanner sobj = new Scanner(System.in);
	
	System.out.println("please enter first number:");
    no1 = sobj.nextInt();
	
	System.out.println("please enter second");
	no2 = sobj.nextInt();
	
	try
	{
	  ans = no1/no2; //exception prone code manje exception exception yeu shakato
	}
	
	catch(ArithmeticException obj)
	{
		System.out.println("Exception occured as :"+obj);
		
	}
	 finally
	 {
	   
	   sobj.close();   //resources parat deto ha finaly ch block
	 }
	 System.out.println("division is:"+ans);
	 
   
  }	  
	
	
}