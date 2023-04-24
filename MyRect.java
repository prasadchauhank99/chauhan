import java.util.*;
class Rect
	{
	      double wid , len;
		public void setData(double x , double y)
		{
		   len=x;
		   wid=y;
		}
		public double perimeter()
		{
		     double res=2*(len+wid);
			return res;
		}
		public double area()
		{
		 double res=(len*wid);
			return res;
		}
		public void display()
		{
		System.out.println("the recdtangle dimentions are "+len +","+wid);
		}
}	
public class MyRect
	{
      public static void main(String args[])
	{
	  Rect r1=new Rect();
	  r1.setData(10.0,20.0);
          r1.display();
          double p=r1.perimeter();
	 double a=r1.area();
	 System.out.println("the perimeter of rectangle"+p+"the area of the rectangle is"+a);
	 }
	}

/*
the rectangle program output:

D:\srinujava>javac MyRect.java

D:\srinujava>java MyRect
the recdtangle dimentions are 10.0,20.0
the perimeter of rectangle60.0the area of the rectangle is200.0

D:\srinujava>
*/
