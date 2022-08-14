import java.lang.*;


class Mythread2
{
	
	public static void main(String arg[])
	{
		Marvellous mobj1 = new Marvellous();
		Thread t1 = new Thread(mobj1,"first");  //start new
		
		Marvellous mobj2 = new Marvellous();
		Thread t2 = new Thread(mobj2,"second");
		
		t1.start();   //State Runnaable
		
		t2.start();
		
		//state Dead
	}
}

class Marvellous extends Thread
{
	public void run()  //Running
	{
		
		for(int i = 0;i<= 1000;i++)
		{
			
		  System.out.println("thread Schedule :"+Thread.currentThread().getName()+":"+i);
		}
		
		
	}
}
