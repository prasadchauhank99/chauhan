import java.util.*;
class Amstrong
{
public static void main(String args[])
{
int n,r,sum=0,m;
Scanner sc = new Scanner(System.in);
System.out.println("enter a number ");
n=sc.nextInt();
m=n;
while(n>0)
{
r=n%10;
sum=sum+(r*r*r) ;
n=n/10;
}
if(m==sum)
{
System.out.println("the given number is amstrong number");
}
else
{
System.out.println("the given number is not - amstrong number");
}
}
}

/*
the output of amstrong number program::


Microsoft Windows [Version 10.0.18363.959]
(c)

C:\Users\prasa>d:

D:\>cd srinujava

D:\srinujava>javac Amstrong.java

D:\srinujava>java Amstrong
enter a number
153
the given number is amstrong number

D:\srinujava>javac Amstrong.java

D:\srinujava>java Amstrong
enter a number
4000
the given number is not - amstrong number

*/
