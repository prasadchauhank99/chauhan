class Bool
{
public static void main(String args[])
{
int count=0;
while(true)
{
  if(count > 4)
    break;
  if(count==0)
  {	
    count++;
    continue;
  }
  System.out.print(count + "  ");
 count++;
}
}
}