import java.lang.*;


interface Circle
{
  float PI=3.14f;
  
  float CalculateArea(float Radius);
  float CalculateCircumfereane(float Radius);
  
}
class Area implement Circle
{
	public float CalculateCircumfereane(float Radius)
	{
		return(PI*Radius*Radius);
	}
	  
	
    public float CalculateArea(float Radius)
	{
		return(PI*Radius*2);
		
	}
	
}









class Marvellous10
{
  public static void main(String arg[])
  {
     Area obj=new Area();
	 float fret=0.0f;
	 
	 fret = obj.CalculateArea(10.5f);
	 System.out.println(+fret);
	 
	 fret= obj.CalculateCircumference(10.5f);
	 System.out.println(+fret);
  
  
  }





}