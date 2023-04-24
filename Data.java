import java.util.*;
import java.io.*;
public class Data
{
public static void main(String args[])
	{
	int a,b,c;
	float fee;
	double avg;
	String name;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the number for a:");
	a=sc.nextInt();
	System.out.println("enter the number for b:");
	b=sc.nextInt();
	System.out.println("enter the number for c:");
	c=sc.nextInt();
	System.out.println("enter the number for fee:");
	fee=sc.nextFloat();
	System.out.println("enter the name");
	name=sc.next();
	avg=(a+b+c+fee)/4.0;
	System.out.println("the value of a is:"+a);
	System.out.println("the value of a is:"+b);
	System.out.println("the value of a is:"+c);
	System.out.println("the value of a is:"+fee);
	System.out.println("the value of a is:"+avg);
	System.out.println("the value of a is:"+name);
	
	}
}