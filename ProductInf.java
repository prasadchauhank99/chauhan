class ProductDetail
{
    int id;
    String name;
    int batchno;
    String date;
    public void data(int a,String n,int c,String d)
{
   id=a;
   name=n;
   batchno=c;
   date=d;
} 
  public void display()
{
System.out.println("the complete details of product is:");
System.out.println("id of the product:"+id);
System.out.println("the name of the product:"+name);
System.out.println("the batchno of product is:"+batchno);
System.out.println("the date of product is:"+date);
}
}
public class ProductInf
{
 public static void main(String args[])
{
  ProductDetail p=new ProductDetail();
  p.data(1921514,"pathaanjali",221,"12-12-12");
  p.display();
}
}