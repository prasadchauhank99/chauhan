import java.util.*;
import java.io.*;
public class EvenOdd
{
public static void main(String args[])
	{
	int a,b,n;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the value of a:");
	a=sc.nextInt();
	System.out.println("enter the value of b:");
	b=sc.nextInt();
	System.out.println("enter the value of n:");
	n=sc.nextInt();
	if(n%2==0)
		{
		System.out.println("the given number is even");
		}
	else
		{
		System.out.println("the number is odd");
		}
	
	}
}