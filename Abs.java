abstract class P
{
abstract void m1();
}
class C extends P
{
void m1()
{
System.out.println("it is abstract");
}
}
public class Abs
{
public static void main(String args[])
{
C c=new C();
c.m1();
}
}