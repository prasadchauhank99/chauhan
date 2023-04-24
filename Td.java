//create a thread by implementing the Runnable interface\
class T2 implements Runnable
{
public void run()
{
for(int i=0;i<5;i++)
{
System.out.println("the value of i is"+i);
}
}
}
public class Td
{
public static void main(String args[])
{
T2 t=new T2();
Thread t1 =new Thread(t);
t1.stat
}
} 