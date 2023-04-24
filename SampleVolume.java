class Volume
{
  final double PI=3.142;
  double getVolume(double r)
{
  return(4.0/3*PI*r*r*r);
}
  void getVolume(double r,double h)
{
System.out.println("the volume of cylinder is:");
     double res = PI*r*r*h;
     System.out.println("the result"+res);

}
double getVolume(int r,int h)
{
return(1/3.0*PI*r*r*h);
}
}
public class SampleVolume
{
 public static void main(String args[])
{
  Volume v1=new Volume();
  System.out.println(v1.getVolume(3.5));
  v1.getVolume(5.0,2.0);
  System.out.println(v1.getVolume(5,8));
}
}
/*
D:\srinujava>javac SampleVolume.java

D:\srinujava>java SampleVolume
179.61766666666665
the volume of cylinder is:
the result157.1
209.46666666666664

*/