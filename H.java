public class H
{
public static void main(String args[])
{
try
{
System.out.println(10/0);
}
catch(ArithmeticException kl)
{
System.out.println(kl);
}
}
}