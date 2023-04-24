import java.util.*;
public class AmstrongNumber
{
public static void main(String args[])
{
int sum,n1,n2,temp,i,r,c=0;
Scanner sc=new Scanner(System.in);
System.out.println("enter the enter the limit range ");
System.out.println("enter the enter the lower limit range ");
n1=sc.nextInt();
System.out.println("enter the enter the higher limit range ");
n2=sc.nextInt();
System.out.println("the amstrong numbers are:");
for(i=n1+1;i<n2;i++)
{
  temp =i;
  sum=0;
  while(temp !=0)
{
    r=temp%10;
    sum=sum+r*r*r;
    temp=temp/10;
}
if(i==sum)
{
System.out.println(i+" ");
}
}
if(c!=0)
{
System.out.println(" amstrong numbers are not found ");
}
}
}