import java.util.*;
import java.io.*;
import java.lang.Math;
public class Series1
{ 
public static void main(String args[])
{
double i,x=0,n=0,sum=0;
Scanner sc=new Scanner(System.in); 
System.out.println("Enter the value of x:");
x=sc.nextDouble();
System.out.println("Enter the value of n:");
n=sc.nextDouble();
for(i=0;i<=n;i++)
{
sum=sum+Math.pow(x,i);
}
System.out.println("the sum is"+sum);
}
}
