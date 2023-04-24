abstract class P
{
abstract void m1()
void m2()
{
System.out.println("it is a parent");
}
class C extends P
{
void m1()
{
System.out.println("it is a child");
}
}
class Abt
{
public static void main(String args[])
{
C c=new C();
c.m1();
c.m2();
}
}