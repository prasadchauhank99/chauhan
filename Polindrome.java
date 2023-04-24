import java.util.*;
public class Polindrome
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
String s=sc.next();
int l=s.length(); 
int i;
int last=l-1;
boolean res=true;
for(i=0;i<l/2;i++)
{
 if(s.charAt(i)!=s.charAt(last))
{
 res = false;
}
last--;
}
if(res==true)
{
System.out.println("the string is polindrom");
}
else
{
System.out.println("the string is not polindrom");
}
}
}

/*


D:\srinujava>javac Polindrome.java

D:\srinujava>java Polindrome
madam
the string is polindrom

D:\srinujava>javac Polindrome.java

D:\srinujava>java Polindrome
srinu
the string is not polindrom

*/