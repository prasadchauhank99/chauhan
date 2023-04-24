class P
{
    String s="srinu   parent";
}
class C extends P
{
  String s="srinu  child";
  int d;
  String name;
  public void data(int k,String i)
{
  d=k;
  name=i;
  System.out.println(s);
  System.out.println(this.s);
 System.out.println(super.s); 
}
}
public class Ma
{
 public static void main(String args[])
{
   C c=new C();
   c.data(200,"chaa");
}
}
