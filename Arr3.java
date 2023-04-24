import java.util.*;
import java.io.*;
public class Arr3
{
public static void main(String args[])
{
int m,n,i,j;
Scanner sc=new Scanner(System.in);
System.out.println("enter the number of rows");
m=sc.nextInt();
System.out.println("enter the number of colomns");
n=sc.nextInt();
int a[][]=new int[m][n];
System.out.println("enter the elements in mat");
for(i=0;i<m;i++)
for(j=0;j<n;j++)
{
a[i][j]=sc.nextInt();
}
for(i=0;i<m;i++)
{
for(j=0;j<n;j++)
{
	System.out.print(a[i][j]+" ");

}
System.out.println();
}
}
}

/*

D:\srinujava>javac Arr3.java

D:\srinujava>java Arr3
enter the number of rows
3
enter the number of colomns
3
enter the elements in mat
5
6
9
8
5
4
7
2
3
5 6 9
8 5 4
7 2 3

*/