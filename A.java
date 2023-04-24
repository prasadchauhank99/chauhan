class B 
{
int i;
public void data(int p);
{
i=p;
}
public void dis()
{
System.out.println(i);
}
}
public class A
{
public static void main(String args[])
{
B b=new B();
b.data(20);
b.dis();
System.out.println("srinu");
}
}

//we have more than independent part for  one flow of excution in single application is called multithreading
//