import java.util.*;
class Volume
{
  int width;
  int height;
  int len;
  public void data(int x,int y,int z)
   {
     width=x;
    height=y;
    len=z;
   }
   public int volume()
   {
     int d=width*height*len;
     return d;
   }
  public void display()
{
System.out.println("the height is"+height+","+"the length is:"+len+","+"the width is "+width);
}   
}
public class VolumeData
{
    Volume v1=new Volume();
    v1.data(10,20,30);
   v1.display();
  int m=v1.volume();
    System.out.println(int m);

}