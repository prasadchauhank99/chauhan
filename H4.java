class H2
{ 
  int a,b,c;
  public void h2(int x,int y)
{
   a=x;
   b=y;
}
   public int h3()
{  
  try
  {
     c=a/b;
     System.out.println(c);
   }
   catch(Exception e)
   {
  System.out.println(e);
   }
}
public void dis()
{
System.out.println(c);
}
}
public class H4
{
public static void main(String args[])
{
  H2 l=new H2();
  l.h2(10,0);
  l.h3();
  l.dis();
}
}