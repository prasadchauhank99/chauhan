//create of thread in two ways 1.extends thread class and 2.implements runnable interface
class T1 extends Thread
{
public void run()
{
for(int i=0;i<5;i++)
{
System.out.println("the value of i is"+i);
}
}
}
public class Thr
{
public static void main(String args[])
{
T1 t = new T1();
t.start();
}
}