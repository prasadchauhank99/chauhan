import java.util.*;
public class Arr2
{
public static void main(String args[])
{
   int m,n,i,j;
   Scanner sc=new Scanner(System.in);
   System.out.println("enter the number of rows");
   m=sc.nextInt();
   System.out.println("enter the number of coloumns");
   n=sc.nextInt();
   int a[][]=new int[m][n];
   for(i=0;i<m;i++)
   for(j=0;j<n;j++)
   {
      a[i][j]=sc.nextInt();
   }
  System.out.println("the representation is");
   for(i=0;i<m;i++)
{
  for(j=0;j<n;j++)
	{
	 System.out.print(a[m][n]);
	 System.out.println();	
	}
}
}
}