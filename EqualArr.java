import java.util.*;
public class EqualArr
{
public static void main(String args[])
{
  int n,m,i,j;
  Scanner sc=new Scanner(System.in);
  System.out.println("enter the size for array1");
  m=sc.nextInt();
  System.out.println("enter the size for array2");
  n=sc.nextInt();
  int a[] = new int[m];
  int b[] = new int[n];
  for(i=0;i<m;i++)
{
  System.out.println("enter the elements for array1");
  a[i]=sc.nextInt();
}
for(i=0;i<n;i++)
{
  System.out.println("enter the elements for array2");
  b[i]=sc.nextInt();
}
System.out.println("the array1 is:");
 for(i=0;i<m;i++)
{
System.out.println(a[i]);
}
System.out.println("the array2 is:");
 for(i=0;i<n;i++)
{
System.out.println(b[i]);
}
if(n==m)
{
for(i=0;i<m;i++)
{
for(j=0;j<n;i++)
{
if(a[i]==b[j])
{
System.out.println("both are equal");
}
else
{
System.out.println("both are equal");
}
}
}
}
}
}