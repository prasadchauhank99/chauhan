public class Sta
{
static int a=10;
static int b=20;//the static key word is used before main
public static void data()
{
System.out.println(a+b);
} 
public static void main(String args[])
{
//Sta s=new Sta();//but the non static members can access by the creating reference object
Sta.data();//since the satatic members can access by class name
}
}