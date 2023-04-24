public class H1
{
public static void main(String args[])
{
  //int a=100,b=0,c;
  // c=a/b;
  // System.out.println(c);//showing ArithmeticException
 // String name=null;
  //System.out.println(name.length());//showing null pointer exception
  try
  {
  int a=10,b=0,c;
  c=a/b;
  System.out.println(c);
  }
  catch(ArithmeticException e)
  {
     //System.out.println(e);
    //e.printStackTrace();
    //System.out.println(e.toString());
    System.out.println(e.getMessage());
  }
}
}