import java.util.*;
public class Arr1
{
public static void main(String args[])
{
	int n ,i;
	Scanner sc=new Scanner(System.in);
	n=sc.nextInt();
	int a[]=new int[n];
	for(i=0;i<n;i++)
	{
		System.out.println("enter the number of elements");
		a[i]=sc.nextInt();
	}
	for(i=0;i<n;i++)
	{
	System.out.println(a[i]);
	}
    
}
}
