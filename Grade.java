import java.util.*;
public class Grade
{
public static void main(String args[])
{
 int m1,m2;
 double m3,m4,avg;
 Scanner sc = new Scanner(System.in);
 System.out.println("enter the marks of student");
 m1=sc.nextInt();
 m2=sc.nextInt();
 m3=sc.nextDouble();
 m4=sc.nextDouble();
 avg=(m1+m2+m3+m4)/4;
System.out.println("average="+avg);
 if(avg>=70.0)
 {
 System.out.println("grade  A ");
 }
 else if(avg>=60.0 && avg<70.0)
 {
 System.out.println("grade  B ");
 }
 else if(avg>=50.0 && avg<60.0)
 {
 System.out.println("grade  c ");
 }
 else if(avg>=40.0 && avg<50.0)
 {
 System.out.println("grade  D ");
 }
 else
 {
 System.out.println(" FAIL ");
 }
}
}
/*
the output of the code is

D:\srinujava>java Grade
enter the marks of student
90
92
95.0
96.0
average=93.25
grade  A

*/