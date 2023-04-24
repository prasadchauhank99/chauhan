import java.util.*;
public class Greatest
{
public static void main(String args[])
{
int a,b,c;
Scanner sc=new Scanner(System.in);
a=sc.nextInt();
b=sc.nextInt();
c=sc.nextInt();
if(a>=b || a>=c)
{
System.out.println("a is greater");
}
else if(b>=a || b>=a)
{
System.out.println("b is greater");
}
else
{
System.out.println("c is greater");
}
}
}