class StudentDetail
{
   int rollno;
   String name;
   double fee;
   public void data(int a,String b,double f)
{
   int rollno=a;
   String name=b;
   double fee=f;
}
  public void display()
{
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
    StudentDetail sd = new StudentDetail();
    sd.data(1221,"Srinu",125000.0);
    sd.display();
}
}