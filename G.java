class G extends Thread
{
public void run()
{
for(int i=0;i<5;i++)
{
System.out.println("srinu"+i);
}
}
public static void main(String args[])
{
int i;
G g=new G();
g.start();
for(i=0;i<5;i++)
{
System.out.println("sri"+i);
}
}
}