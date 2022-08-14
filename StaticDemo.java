import java.lang.*;

class StaticDemo
{
   public static void main(String arr[])
   {
	 Demo.gun();
     Demo obj;
     obj = new Demo();
     obj.fun();	 
   
      System.out.println(obj.i);
	  System.out.println(obj.j);
   
   }





}


class Demo
{
  public int i;
  public int j;
  public static int k;
  
  public Demo()
  {
	  this.i=0;
	  this.j=0;
  
  }
  
  public void fun()
  {
	
	  System.out.println("Inside non static fun");
      System.out.println(this.i);
	  System.out.println(this.j);
  }
  
  public static void gun()
  {
	  System.out.println("Inside gun");
	  //System.out.println(this.i);
	  //System.out.println(this.j);
	  System.out.println(k);
	 
  }

}


