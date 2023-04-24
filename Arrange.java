import java.util.*;
public class Arrange
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n;
n=sc.nextInt();
int a[]=new int[n];
int i ,j;
for(i=0;i<n;i++)
{
a[i]=sc.nextInt();
}
for(i=0;i<n;i++)
{
for(j=i+1;j<n;j++)
{
  if(a[i]>a[i+1])
{
   int temp=a[i];
   a[i]=a[i+1];
   a[i+1]=temp;
}
}
}
System.out.println(a[i]);
}
}