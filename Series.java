import java.util.*;
public class Series
{
public static void main(String args[])
{
   int n,x,i;
  Scanner sc = new Scanner();
  System.out.println("enter the number for power terms");
  n=sc.nextInt();
 System.out.println("enter the main x term");
  x=sc.nextInt();
  for(i=1;i<n;i++)
{
  int temp=x;
   int s=1;
   s=s+(temp*x);
}  
System.out.println(s);
}
}