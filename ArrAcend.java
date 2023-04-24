import java.util.*;
public class ArrAcend
{
public static void main(String args[])
{
 int n,i,j;
 Scanner sc=new Scanner(System.in);
 System.out.println("enter the size of 1-d");
 n=sc.nextInt();
 int a[]=new int[n];
System.out.println("enter the elements for 1-d");
 for(i=0;i<a.length;i++)
{
   a[i]=sc.nextInt();
}
  for(i=0;i<a.length;i++)
{
  for(j=i+1;j<a.length;j++)
{
    if(a[i]>a[j])
          {
	     int tmp=a[i];
              a[i]=a[j];
	      a[j]=tmp;
	  }



}
System.out.print(a[i]+"   ");
}
}
}

/*

D:\srinujava>javac ArrAcend.java

D:\srinujava>java ArrAcend
enter the size of 1-d
5
enter the elements for 1-d
1
8
9
6
7
1   6   7   8   9


*/