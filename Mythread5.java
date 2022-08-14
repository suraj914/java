import java.lang.*;


class Mythread5
{
   public static void main(String arg[]) throws Exception
   {
    Demo obj1 = new Demo();
    Thread t1 = new Thread(obj1,"first"); ///new state
	
	Demo obj2 = new Demo();
    Thread t2 = new Thread(obj2,"second"); 
	
	
	t1.start();//Runnable state
	
	t1.join();
	
	t2.start();
    
   
   
   }


}

class Demo extends Thread
{
    public void run()      //Runiing
    { 
      int i = 0;
      for(i = 0 ; i<10; i++);
      {
	    System.out.println("value of :"+i);
	  }
	  
	  try
	  {
	   Thread.sleep(1000);
	  }
	 
	  catch(Exception obj)
	  {}
    //System.out.println("Value of :"+i);
    }
 
  

}
