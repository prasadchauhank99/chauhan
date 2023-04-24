import java.util.*;
public class Pattern
{
public static void main(String args[])
{
int n;
int i,j,c=0;
Scanner sc=new Scanner(System.in);
System.out.println("enter the number of rows");
n=sc.nextInt();
for(i=1;i<=n;i++)
{
for(j=1;j<=i;j++)
{
  c=c+1;
System.out.print(c+"  ");
}
System.out.println();
}
}
}

