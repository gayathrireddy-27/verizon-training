class Test1 {
void show()
{
System.out.println("parent class called");
}}
class test extends Test1
{
void show(){
System.out.println("child class called");
}
}class overload{
public static void main(String args[])
{
test t=new test();
t.show();
}
}