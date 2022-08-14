import java.lang.*;

import java.util.*;

class Input
{
 public static void main (String a[])
 {
   Scanner sobj = new Scanner(System.in);
   
   System.out.println("please enter ur name");
   String name =sobj.nextLine();
   
   System.out.println("please enter your age");
   int Age =sobj.nextInt();
   
   System.out.println("percentage");
   float percentage =sobj.nextFloat();
   
   System.out.println("your name is ;"+name);
   System.out.println("your name is ;"+Age);
   
   System.out.println("your name is ;"+percentage);
   sobj.close();
   
   

   
 }	 
}