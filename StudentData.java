
class StudentDetail
{
   int rollno;
   String name;
   double fee;
   public void data(int a,String b,double f)
{
    rollno=a;
    name=b;
    fee=f;
}
  void dly()
{
  // System.out.println(rollno+" "+name+" "+fee);
  System.out.println("the complete details of the student:::");
  System.out.println("the rollnumber of the student is:"+rollno);
  System.out.println("the name of the student is:"+name);
 System.out.println("the fee of the student is:"+fee);
}
}
public class StudentData
{
  public static void main(String args[])
{
    StudentDetail s11=new StudentDetail();
    s11.data(21,"Srinu",125000.0);
    s11.dly();
}
}

/*
D:\srinujava>javac StudentData.java

D:\srinujava>java StudentData
the complete details of the student:::
the rollnumber of the student is:21
the name of the student is:Srinu
the fee of the student is:125000.0

*/