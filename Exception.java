import java.util.*;

class Exception
{
  public static void main(String arg[])

  {
    Scanner sobj = new Scanner(System.in);
	
	System.out.println("please enter first number:");
	int no1 = sobj.nextInt();
	
	System.out.println("please enter second");
	int no2 = sobj.nextInt();
	
	int ans = no1/no2;
	
	System.out.println("division is:"+ans);
	sobj.close();
	
   
  }	  
	
	
}