import java.lang.*;
import java.util.*;



class Exception4
{
	
	public static void main(String arr[])
	{
		
		int Arr[]={10,20,30,40,50};
		Scanner sobj =new Scanner(System.in);
		System.out.println("enter the index");
		int index =sobj.nextInt();
		
		try
		{
			System.out.println("element at indes is:"+Arr[index]);
		}
		
		
		 catch(ArrayIndexOutOfBoundsException obj)
		 {
			 
			 
		 }
		 catch(Exception obj)
		{
		System.out.println(obj);	
		}
	}
}