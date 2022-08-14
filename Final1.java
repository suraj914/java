import java.lang.*;

class Final1
{
 public static void main(String arg[])
 {
   Demo obj =new Demo();
   obj.fun();
 
 }
}

class Demo
{
   public int i;
   public final int j = 20;
   public final int k;
   
   public Demo()
   {
     this.i=10;
	 this.k=30;
	}
	
	public void fun()
	{
	  i++;  //a
	 
	 // j++;  //NA
	 // k++;   //NA
	 }
	 
}