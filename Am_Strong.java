import java.util.*;
class Am_Strong
{
public static void main(String args[])
{
int n,r,s=0;
Scanner sc = new Scanner(System.in);
System.out.println("enter a number ");
n=sc.nextInt();
int m==n;
while(n>0)
{
r=n%10;
s=s+(r*r*r);
n=n/10;
}
if(s==m)
{
System.out.println("the given number is amstrong number");
}
else
{
System.out.println("the given number is not - amstrong number");
}
}
}