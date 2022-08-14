import java.lang.*;


class Mythread7
{
   public static void main(String arg[]) throws Exception
   {
    
     Marvellousnmobj1 = new Marvellous(5);
	 Marvellous mobj2 = new Marvellous(8);
   
    mobj1.Accept();
	mobj1.Display();
	
	mobj2.Accept();
	mobj2.Display();
	
	THread t1 = new Thread(mobj1);
	Thread t2 = new Thread(mobj2);
	

   }


}

class Marvellous
{
  public int Arr[];

  public Marvellous(int size)
  {
    Arr = new int[size];
  
 }
 
 public void Accept()
 {
	 Scanner sobj = new Scanner(System.in);
	 System.out.println("enter the no");
	 
	 for(int i =0;i<this.Arr.length;i++)
	 {
		 this.Arr[i]=sobj.nextInt();
     }		 
}
public void Display()
{
	
	System.out.println("data is :");
	for(int i=0;i<this.Arr.lenth;i++)
	{
		this.Arr[i]=sobj.nextInt()
	}
}


class Demo extends Thread
{
	public marvellous mref;
	public Demo(Marvellous obj)
	{
		this.mref= obj;
	}
    public void run()      //Runiing
    { 
	
	
	
	}
}