import java.lang.*;
import java.awt.*;
import java.awt.event.*;

class MarvellousListner implements WindowListener
{
  public void windowDeactivated(WindowEvent obj){};
  public void windowActivated(WindowEvent obj){};
  
  

}

class FrameDemo3
{
  public static void main (String arg[])
  {
	  
    System.out.println("print data on console");
	
	MarvellousFrame mobj = new MarvellousFrame("PPA");
  }
  
  
}



class MarvellousFrame
{
  public Frame fobj;
  
  public MarvellousFrame(String name)
  {
  
   fobj = new Frame(name);
   fobj.setSize(600,600);
   fobj.setVisible(true);
   
   fobj.addWindowListener(new MarvellousListener());
   

   
  }
}
  
