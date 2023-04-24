class T1 implements Runnable
{
public void run()
{
for(int i=0;i<=10;i++)
{
try
{
if(i==5) sleep(5000);
sleep(1000);
}
catch(Exception e)
{
System.out.println(e);
}
System.out.println("the value of i ="+i);
}
System.out.println("the t1 thread is exists");
}
}
public class Thread1
{
public static void main(String args[])
{
T1 t1=new T1();
Thread th=new Thread(t1);
th.start();
}
}
