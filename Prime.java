import java.util.*;
class Prime
{
public static void main(String args[])
{
int m,n,i,j;
Scanner sc=new Scanner(System.in);
System.out.println("enter the number for m:");
m=sc.nextInt();
System.out.println("enter the number for n:");
n=sc.nextInt();
for(i=m;i<=n;i++)
{
int c=0;
for(j=1;j<=i;j++)
{
if(i%j==0)
{
c=c+1;
}
}
if(c==2)
{
System.out.println("the prime numbers :"+i);
}
}
}
}

/*
Microsoft Windows [Version 10.0.18363.959]
(c) 2019 Microsoft Corporation. All rights reserved.

C:\Users\prasa>d:

D:\>cd srinujava

D:\srinujava>javac Prime.java

D:\srinujava>java Prime
enter the number for m:
1
enter the number for n:
10
the prime numbers :2
the prime numbers :3
the prime numbers :5
the prime numbers :7
*/

