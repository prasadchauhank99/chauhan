class D1
{
  int age;
  String name;
  int salary;
  public void data(int a,String s,int b)
  {
     age=a;
     name=s;
     salary=b;
  }
  public int bonus(int s2)
{
  int res=salary+s2;
  return res;
}
 public void display()
{
System.out.println("the name is"+name+"the age is :"+age+"the salary is"+salary);
}
}
public class De
{
public static void main(String args[])
{
D1 d = new D1();
d.data(20,"srinu",2000000);
d.display();
int p=d.bonus(2000);
System.out.println("the bonus amount is:"+p);
}
}