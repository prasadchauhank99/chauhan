import java.util.Scanner;
class Poll
{
public static void main(String args[])
{
Scanner s = new Scanner(System.in);
int a,b;
System.out.println("enter the number for a:");
a=s.nextInt();
System.out.println("enter the number for b:");
b=s.nextInt();
if(a>b)
{
System.out.println("Yes the number of a is greater than b");
}
}
}