interface i1
{
void show();
}
class test implements i1
{
public void show()
{
System.out.println("show method called");
}
}
class mi 
{
public static void main(String args[])
{ test t=new test();
t.show();
}}