abstract class abs{
abstract void show();
void disp()
{
System.out.println("complete method of abs clas");
}}
class test extends abs
{
void show(){
System.out.println("abs method of test");
}
}class demo{
public static void main(String args[])
{
test t=new test();
t.show();
t.disp();
}}