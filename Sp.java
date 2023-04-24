//any service reqirement specicification used the interface
//declaration of interface
interface Inter
{
   public void m1();
   public void m2();
}
class Sp implements Inter
{
    public void m1()
{
System.out.println("srinu");
}
public void m2()
{
System.out.println("chauhan");
}
}
class As
{
public static void main(String args[])
{
Inter s=new Sp();
s.m1();
s.m2();
}
}