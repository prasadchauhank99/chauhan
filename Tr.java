class T1 extends Thread
{
public void run()
{
for(int i=0;i<10;i++)
{
System.out.println("srinu"+i);
}
}
}
public class Tr
{
public static void main(String args[])
{
T1 t=new T1();
t.start();
}
}