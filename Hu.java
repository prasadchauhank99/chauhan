interface Human
{
public abstract void eat();
public abstract void sleep();
}
class C implements Human
{
 public void eat()
{
System.out.println("YES AM EATING");
}
public void sleep()
{
System.out.println("YES AM SLEEPING");
}
}
public class Hu
{
public static void main(String args[])
{
C c=new C();
c.eat();
c.sleep();
}
}