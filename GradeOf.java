import java.util.*;
public class GradeOf
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the grade");
char g=sc.next().charAt(0);
switch(g)
{
      case 'A':
              System.out.println("more then 90% is A GRADE");
              break;
      case 'B':
              System.out.println("more then 70% is B GRADE");
              break;
      case 'C':
              System.out.println("more then 50% is C GRADE");
               break;
      case 'D':
              System.out.println("more then 40% is D GRADE");
               break;
      default:
              System.out.println("Fail");
}
}
}