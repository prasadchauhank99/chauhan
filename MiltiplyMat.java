import java.util.*;
public class MiltiplyMat
{
public static void main(String args[])
{
 int m,n,p,q,i,j;
 Scanner sc=new Scanner(System.in);
 System.out.println("enter the size of mat1");
 m=sc.nextInt();
  n=sc.nextInt();
System.out.println("enter the size of mat2");
 p=sc.nextInt();
 q=sc.nextInt();
if(n!=p)
{
System.out.println("the matmultiply is not possible");
System.exit(0);
}
 int a[][]=new int[m][n];
 int b[][]=new int[p][q];
 System.out.println("enter the elements for mat1");
 for(i=0;i<m;i++)
 for(j=0;j<n;j++)
{
  a[i][j]=sc.nextInt();
}
System.out.println("enter the elements for mat2");
for(i=0;i<p;i++)
for(j=0;j<q;j++)
{
b[i][j]=sc.nextInt();
}
System.out.println("the mat1 is:");
 for(i=0;i<m;i++)
{
for(j=0;j<n;j++)
{
System.out.print("  "+a[i][j]);
}
System.out.println();
}

 System.out.println("the mat2 is:");
 for(i=0;i<p;i++)
{
for(j=0;j<q;j++)
{
System.out.print("  "+b[i][j]);
}
System.out.println();
}

System.out.println("stores the result in mat3");
int c[][]=new int[m][q];
for(i=0;i<m;i++)
{
for(j=0;j<q;j++)
{
c[i][j]=0;
for(int k=0;k<p;k++)
 c[i][j]=c[i][j]+a[i][k]*b[k][j];
}
}
System.out.println("the product of two matrix is");
for(i=0;i<m;i++)
{
for(j=0;j<q;j++)
  System.out.print("  "+c[i][j]);
System.out.println();
}
}
}


/*

D:\srinujava>javac MiltiplyMat.java

D:\srinujava>java MiltiplyMat
enter the size of mat1
5
4
enter the size of mat2
2
1
the matmultiply is not possible

D:\srinujava>javac MiltiplyMat.java

D:\srinujava>java MiltiplyMat
enter the size of mat1
3
3
enter the size of mat2
3
3
enter the elements for mat1
1
2
3
4
5
6
4
1
2
enter the elements for mat2
2
5
8
7
4
3
1
6
8
the mat1 is:
  1  2  3
  4  5  6
  4  1  2
the mat2 is:
  2  5  8
  7  4  3
  1  6  8
stores the result in mat3
the product of two matrix is
  19  31  38
  49  76  95
  17  36  51

D:\srinujava>

*/


