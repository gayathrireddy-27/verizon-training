interface i1
{
int id=21;
}interface i2 extends i1
{
int id= 23;
}
class demo1 implements i2
{
public static void main(String args[])
{
System.out.println("value of id is:"+id);
}
} 