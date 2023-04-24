class H0
{
 public void m1()
{
try
{
int a=10,b=0,c;
c=a/b;
System.out.println(c);
}
catch(Exception e)
{
System.out.println(e);
}
}
}
public class H5
{
public static void main(String args[])
{
  H0 h0=new H0();
  h0.m1();
}
}