// Area of circle
class Area
{
public static void main(String args[])
{
	circle c = new circle();
	c.x=4;
	c.y=5;
	c.r=6;
	System.out.println("The circumference"+c.circumference());
	System.out.println("The Area"+c.area());
}
}