class A
{
int a=10;
int b=10;
public void add()
{
System.out.println("addition is"+(a+b));
}
}
public class B extends A
{
 int a=100;
 int b=20;
 public void add()
{
System.out.println("addition is"+(a+b));
}
public static void main(String args[])
{
  //A a=new A();
  //a.add();
  super.add();
  B b=new B();
  b.add();
}
}