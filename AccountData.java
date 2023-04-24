import java.util.*;
class Account
{
  int accno;
 String name;
double balance;
public void dataDetail(int x,String y,double z)
{
   accno=x;
   name=y;
   balance=z;
}
public double deposit(double money)
{
  double res=balance+money;
 return res;
}
public double getBal()
{
 return(balance);
}
public double withdraw(double amt)
{
double res=balance-amt;
return res;
}
public void display()
{
System.out.println("the account holder name"+name+","+"the account number"+accno+","+"the balance is:"+balance);
}
}
public class AccountData
{
public static void main(String args[])
{
 Account a1 = new Account();
a1.dataDetail(76602,"srinuchauhan",250000.0);
a1.display();
double d=a1.deposit(2000.0);
double g = a1.getBal();
double w=a1.withdraw(1000.0);
System.out.println("get balance"+g+","+"the amout deposit"+d+","+"the amout withdraw"+w);

}
}
/*

D:\srinujava>javac AccountData.java

D:\srinujava>java AccountData
the account holder namesrinuchauhan,the account number76602,the balance is:250000.0
get balance250000.0,the amout deposit252000.0,the amout withdraw249000.0

*/