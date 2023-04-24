import java.util.*;
public class TripleStr
{
public static void main(String args[])
{
int n;
Scanner sc=new Scanner(System.in);
System.out.println("enter the number of strings");
n=sc.nextInt();
String s[]=new String[n];
for(int i=0;i<s.length;i++)
{
    s[i]=sc.next();
}
System.out.println("the list of names in array:");
for(int i=0;i<s.length;i++)
{
System.out.println(s[i]);
}
for(int i=0;i<n;i++)
{
for(int j=i+1;j<n;j++)
{
    if(s[i].compareTo(s[j])>0)
{
    String c =s[i];
       s[i]=s[j];
       s[j]=c;
}
}
}
System.out.println("the out put with assending strings");
for(int i=0;i<s.length;i++)
{
 System.out.println(s[i]);
}
}
}


/*
D:\srinujava>javac TripleStr.java

D:\srinujava>java TripleStr
enter the number of strings
4
zooop
cat
maan
opzzzz
the list of names in array:
zooop
cat
maan
opzzzz
the out put with assending strings
cat
maan
opzzzz
zooop


*/