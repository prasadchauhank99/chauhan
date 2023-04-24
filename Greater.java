import java.util.*;
public class Greatest
{
public static void main(String args[])
{
int a,b,c;
Scanner sc=new Scanner(System.in);
System.out.println("enter the numbers for the elements :");
a=sc.nextInt();
b=sc.nextInt();
c=sc.nextInt();
if(a>b)
{
if(a>c)
{
System.out.println("a is greater than c");
}
else
{
System.out.println("a is greater than b");
}
}
}
}